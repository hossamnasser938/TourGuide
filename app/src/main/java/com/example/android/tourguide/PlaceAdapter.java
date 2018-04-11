package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hosam on 4/11/2018.
 */

public class PlaceAdapter extends ArrayAdapter {

    private boolean hasImage;

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places, boolean hasImage) {
        super(context, 0, places);
        this.hasImage = hasImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        Place place = (Place) getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.place_template, parent, false);
        }

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.place_template, null);

        TextView name = view.findViewById(R.id.place_name);
        name.setText(place.getName());

        TextView address = view.findViewById(R.id.place_address);
        address.setText(place.getAddress());

        TextView telephone = view.findViewById(R.id.place_telephone);
        telephone.setText(place.getTelephone());

        ImageView image = view.findViewById(R.id.place_image);

        if(hasImage){
            image.setImageResource(place.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }
        else{
            image.setVisibility(View.GONE);
        }

        return view;

    }
}
