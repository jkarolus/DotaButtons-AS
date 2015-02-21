package de.jakobkarolus.dotabuttons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import de.jakobkarolus.dotabuttons.io.HeroResponseParser;
import de.jakobkarolus.dotabuttons.layout.CustomizedArrayAdapter;
import de.jakobkarolus.dotabuttons.model.HeroResponse;

/**
 * custom {@link ListActivity} that provides access to our hero responses
 * 
 * @author Jakob
 *
 */
public class DotaButtons extends ListActivity{
	
	private static final String TAG = DotaButtons.class.getName();
	public static final String DOTA_2 = "Dota 2";
	public static final String DOTA_2_REPORTER = "Reporter";

	
	private CustomizedArrayAdapter buttonsReporter;
	private CustomizedArrayAdapter buttonsDota;
	
	private boolean sendAudio;
	private int flags;

	private MediaPlayer player;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		loadResponses();
		setupMediaPlayer();
		setupActionBar();
		
		Intent intent = getIntent();
		if(intent.getAction() == "com.whatsapp.action.WHATSAPP_RECORDING"){
			sendAudio = true;
			flags = intent.getFlags();
		}
		else
			sendAudio = false;
		
	}


	private void setupMediaPlayer() {
		//init MediaPlayer
		player = new MediaPlayer();
		player.setAudioStreamType(AudioManager.STREAM_MUSIC);
		player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				releasePlayer();
			}
		});
		player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
			
			@Override
			public void onPrepared(MediaPlayer mp) {
				mp.start();
			}
		});
	}


	private void setupActionBar() {
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		// Create a tab listener that is called when the user changes tabs.
	    ActionBar.TabListener tabListener = new ActionBar.TabListener() {
			@Override
			public void onTabSelected(Tab tab, FragmentTransaction ft) {
				//cancel playback
				releasePlayer();

				if(tab.getText().equals(DOTA_2))
					setListAdapter(buttonsDota);
				else
					setListAdapter(buttonsReporter);
			}

			@Override
			public void onTabUnselected(Tab tab, FragmentTransaction ft) {
				
			}

			@Override
			public void onTabReselected(Tab tab, FragmentTransaction ft) {
				
			}
	    };
	    
		actionBar.addTab(actionBar.newTab().setText(DOTA_2_REPORTER).setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText(DOTA_2).setTabListener(tabListener));
	}


	private void loadResponses() {
		//load entries and associate with ArrayAdapter
		List<HeroResponse> entriesReporter = HeroResponseParser.loadReporterResponseData();
		buttonsReporter =  new CustomizedArrayAdapter(this, R.layout.dota_buttons_list_entry, entriesReporter);
		List<HeroResponse> entriesDota = HeroResponseParser.loadDotaHeroResponseData();
		buttonsDota =  new CustomizedArrayAdapter(this, R.layout.dota_buttons_list_entry, entriesDota);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dota_buttons, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
			
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		InfoDialog fragment = new InfoDialog();
		fragment.show(ft, "InfoDialog");
		
		return true;
	}
	
	/**
	 * 
	 * display a dialog containing info about DotaButtons
	 * 
	 * @author Jakob
	 * 
	 */
	public class InfoDialog extends DialogFragment {


		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
			builder.setTitle("DotaButtons");
			builder.setMessage("By: Jakob Karolus\nVersion 1.2");
			builder.setNegativeButton(R.string.back,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							InfoDialog.this.getDialog().cancel();
						}
					});

			return builder.create();
		}
	}
	
	@Override
	protected void onStop() {
		releasePlayer();
		super.onStop();
	}

	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		super.onListItemClick(l, v, position, id);
		HeroResponse entry = (HeroResponse) getListView().getItemAtPosition(position);
		
		//cancel previous playback
		releasePlayer();
		
		if(!sendAudio){
		
			//initialize player with new HeroResponse and start playing
			 try {
		            AssetFileDescriptor afd = getApplicationContext().getResources().openRawResourceFd(entry.getSoundFile());
		            if (afd == null){
		            	Toast.makeText(getApplicationContext(), "Couldn't decode media file", Toast.LENGTH_SHORT).show();
		            	return;
		            }
	
		            player.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
		            afd.close();
		            player.prepareAsync();	            
		            
		        } catch (IOException ex) {
		            Log.d(TAG, "create failed:", ex);
		            // fall through
		        } catch (IllegalArgumentException ex) {
		            Log.d(TAG, "create failed:", ex);
		           // fall through
		        } catch (SecurityException ex) {
		            Log.d(TAG, "create failed:", ex);
		            // fall through
		        }
		}
		else{
			
			String fileName= getExternalCacheDir().getAbsolutePath() + "/" + entry.getSoundFile() + ".mp3";

			try{
				InputStream in = getResources().openRawResource(entry.getSoundFile());
				FileOutputStream out = new FileOutputStream(fileName, false);

				byte[] buff = new byte[1024];
			    int read = 0;

			    try {
			       while ((read = in.read(buff)) > 0) {
			          out.write(buff, 0, read);
			       }
			    } catch (IOException e) {
					Toast.makeText(this, "Cant access media file!", Toast.LENGTH_SHORT).show();;
				} finally {
			         try {
						in.close();
				        out.close();
					} catch (IOException e) {
						Toast.makeText(this, "Cant access media file!", Toast.LENGTH_SHORT).show();;
						}
			    }
				
			} catch (FileNotFoundException e) {
				Toast.makeText(this, "Cant access media file!", Toast.LENGTH_SHORT).show();;
			}
			

			Intent intent = new Intent(Intent.ACTION_SEND, Uri.fromFile(new File(fileName)));
			this.setResult(RESULT_OK, intent);
			finish();
		}
		
	}
	
	/**
	 * resets the player upon finishing a playback or when interrupted
	 * 
	 */
	private void releasePlayer(){
		player.reset();
	}

}
