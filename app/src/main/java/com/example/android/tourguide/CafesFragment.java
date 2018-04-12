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

public class CafesFragment extends Fragment {

    public CafesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> cafes = new ArrayList<>();
        cafes.add(new Place("Solo Cafe", "Taha Hussien st", "01236524850"));
        cafes.add(new Place("Mo Lounge", "Inside City Skape Mall", "01023698740"));
        cafes.add(new Place("Lyaly Libnan", "Libnan Square st", "01200365200"));
        cafes.add(new Place("Zelzal", "Korneesh st", "01236524850"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), cafes, false);

        ListView cafesList = rootView.findViewById(R.id.place_list);

        cafesList.setAdapter(adapter);

        return rootView;

    }

}
