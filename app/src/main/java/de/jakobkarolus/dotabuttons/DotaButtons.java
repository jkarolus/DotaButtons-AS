package de.jakobkarolus.dotabuttons;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import de.jakobkarolus.dotabuttons.fragments.ListFragment;

/**
 *
 * @author Jakob
 *
 */
public class DotaButtons extends Activity{
	
	private static final String TAG = DotaButtons.class.getName();
    public static final String SEND_AUDIO = "sendAudio";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dota_buttons);

        if (savedInstanceState == null) {
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ListFragment frag = new ListFragment();
            Bundle args = new Bundle();
            args.putBoolean(SEND_AUDIO, getIntent().getAction() == "com.whatsapp.action.WHATSAPP_RECORDING");
            frag.setArguments(args);
            ft.add(R.id.container, frag);
            ft.commit();
        }
		
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
	public static class InfoDialog extends DialogFragment {


		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
			builder.setTitle("DotaButtons");
			builder.setMessage("By: Jakob Karolus\nVersion 1.4");
			builder.setNegativeButton(R.string.back,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							InfoDialog.this.getDialog().cancel();
						}
					});

			return builder.create();
		}
	}

}
