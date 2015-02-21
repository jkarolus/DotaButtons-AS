package de.jakobkarolus.dotabuttons.layout;

import java.util.List;

import de.jakobkarolus.dotabuttons.R;
import de.jakobkarolus.dotabuttons.model.HeroResponse;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * an {@link ArrayAdapter} tailored to our DotaButtons list format
 * 
 * @author Jakob
 *
 */
@SuppressLint("InflateParams")
public class CustomizedArrayAdapter extends ArrayAdapter<HeroResponse>{

	public CustomizedArrayAdapter(Context context, int resource,
			List<HeroResponse> objects) {
		super(context, resource, objects);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
		
		if(v== null){
			LayoutInflater vi;
			vi = LayoutInflater.from(getContext());
			v = vi.inflate(R.layout.dota_buttons_list_entry, null);
		}
		
		HeroResponse item = getItem(position);
		
		if(item != null){
			
			
			if(item.isNewVersion())
				v.setBackgroundColor(Color.argb(50, 255, 153, 0));
			else
				v.setBackgroundColor(Color.argb(100, 255, 255, 255));
			
			ImageView image = (ImageView) v.findViewById(R.id.image);
			TextView name = (TextView) v.findViewById(R.id.name);
			

			
			if(image != null)
				image.setImageResource(item.getHero().getImageForHero());
			
			if(name != null)
				name.setText(item.getResponse());
		}
		
		return v;
		
	}

}
