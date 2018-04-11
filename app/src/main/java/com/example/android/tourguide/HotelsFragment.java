package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Hosam on 4/11/2018.
 */

public class HotelsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> hotels = new ArrayList<>();
        hotels.add(new Place("Ekhnatoon", "Opposite to Police Club", "01019732564"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), hotels, false);

        ListView hotelsList = rootView.findViewById(R.id.place_list);

        hotelsList.setAdapter(adapter);

        return rootView;

    }

}
