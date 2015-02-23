package de.jakobkarolus.dotabuttons.layout;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import de.jakobkarolus.dotabuttons.R;
import de.jakobkarolus.dotabuttons.model.HeroResponse;
import de.jakobkarolus.dotabuttons.model.Heroes;

/**
 * Created by Jakob on 21.02.2015.
 */
public class CustomListAdapter extends BaseExpandableListAdapter{

    private List<List<HeroResponse>> responses;
    private List<Heroes> heroes;
    private Context ctx;
    private String title;
    private int indicatorColor;

    public CustomListAdapter(Map<Heroes, List<HeroResponse>> responses, Context ctx, String title, int indicatorColor) {

        this.responses = new Vector<>();
        this.heroes = new Vector<>();
        for(Heroes h : responses.keySet()){
            this.heroes.add(h);
            this.responses.add(responses.get(h));
        }

        this.ctx = ctx;
        this.title = title;
        this.indicatorColor = indicatorColor;
    }

    public String getTitle(int position){
        return this.title;
    }

    public int getIndicatorColor(){
        return this.indicatorColor;
    }


    @Override
    public int getGroupCount() {
        return heroes.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return responses.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return heroes.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return responses.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(ctx);
            convertView = vi.inflate(R.layout.dota_buttons_list_group, null);
        }

        ExpandableListView mExpandableListView = (ExpandableListView) parent;
        mExpandableListView.setGroupIndicator(null);

        Heroes hero = (Heroes) getGroup(groupPosition);
        TextView t = (TextView) convertView.findViewById(R.id.dota_buttons_list_group_name);
        ImageView i = (ImageView) convertView.findViewById(R.id.dota_buttons_list_group_icon);

        t.setText(hero.getNameForHero());
        i.setImageResource(hero.getImageForHero());

        convertView.setBackgroundColor(Color.argb(255, 250, 250, 250));

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(ctx);
            convertView = vi.inflate(R.layout.dota_buttons_list_entry, null);
        }

        HeroResponse response = (HeroResponse) getChild(groupPosition, childPosition);
        TextView t = (TextView) convertView.findViewById(R.id.dota_buttons_list_entry_response);
        t.setText(response.getResponse());


        if(response.isNewVersion())
            convertView.setBackgroundColor(Color.argb(50, 255, 153, 0));
        else
            convertView.setBackgroundColor(Color.argb(100, 255, 255, 255));

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
