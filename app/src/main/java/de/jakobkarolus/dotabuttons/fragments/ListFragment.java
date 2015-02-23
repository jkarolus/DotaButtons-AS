package de.jakobkarolus.dotabuttons.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.DotaButtons;
import de.jakobkarolus.dotabuttons.R;
import de.jakobkarolus.dotabuttons.io.HeroResponseParser;
import de.jakobkarolus.dotabuttons.layout.CustomListAdapter;
import de.jakobkarolus.dotabuttons.model.HeroResponse;
import de.jakobkarolus.dotabuttons.view.SlidingTabLayout;

/**
 * Created by Jakob on 22.02.2015.
 */
public class ListFragment extends Fragment{

    private static final String TAG = "DB_ListFragment";

    private SlidingTabLayout mSlidingTabLayout;
    private ViewPager mViewPager;

    List<CustomListAdapter> adapters;

    private boolean sendAudio;

    private MediaPlayer player;

    public ListFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupMediaPlayer();
        loadResponses();

        sendAudio = getArguments().getBoolean(DotaButtons.SEND_AUDIO);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dota_buttons_fragment,
                container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setAdapter(new CustomPagerAdapter());

        mSlidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.sliding_tabs);
        mSlidingTabLayout.setViewPager(mViewPager);
        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {

            @Override
            public int getIndicatorColor(int position) {
                return adapters.get(position).getIndicatorColor();
            }

        });

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

    private void loadResponses() {

        adapters = new Vector<>();

        //load entries and associate with adapters
        adapters.add(new CustomListAdapter(HeroResponseParser.loadReporterResponseData(), getActivity(), "Reporter", Color.BLUE));
        adapters.add(new CustomListAdapter(HeroResponseParser.loadDotaHeroResponseData(), getActivity(), "Dota 2", Color.RED));
    }

    private void playback(HeroResponse entry) {

        //cancel previous playback
        releasePlayer();

        if(!sendAudio){

            //initialize player with new HeroResponse and start playing
            try {
                AssetFileDescriptor afd = getActivity().getResources().openRawResourceFd(entry.getSoundFile());
                if (afd == null){
                    Toast.makeText(getActivity(), "Couldn't decode media file", Toast.LENGTH_SHORT).show();
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

            String fileName= getActivity().getExternalCacheDir().getAbsolutePath() + "/" + entry.getSoundFile() + ".mp3";

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
                    Toast.makeText(getActivity(), "Cant access media file!", Toast.LENGTH_SHORT).show();;
                } finally {
                    try {
                        in.close();
                        out.close();
                    } catch (IOException e) {
                        Toast.makeText(getActivity(), "Cant access media file!", Toast.LENGTH_SHORT).show();;
                    }
                }

            } catch (FileNotFoundException e) {
                Toast.makeText(getActivity(), "Cant access media file!", Toast.LENGTH_SHORT).show();;
            }


            Intent intent = new Intent(Intent.ACTION_SEND, Uri.fromFile(new File(fileName)));
            getActivity().setResult(Activity.RESULT_OK, intent);
            getActivity().finish();
        }

    }

    @Override
    public void onStop() {
        releasePlayer();
        super.onStop();
    }

    /**
     * resets the player upon finishing a playback or when interrupted
     *
     */
    private void releasePlayer(){
        player.reset();
    }

    private class CustomPagerAdapter extends PagerAdapter{


        @Override
        public int getCount() {
            return adapters.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return o == view;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return adapters.get(position).getTitle(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.dota_buttons_pager_item, container, false);
            container.addView(view);

            ExpandableListView listView = (ExpandableListView) view.findViewById(R.id.dota_buttons_list);
            listView.setAdapter(adapters.get(position));
            listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                    HeroResponse response = (HeroResponse) parent.getExpandableListAdapter().getChild(groupPosition, childPosition);
                    playback(response);
                    return true;
                }
            });

            return view;
        }
    }
}
