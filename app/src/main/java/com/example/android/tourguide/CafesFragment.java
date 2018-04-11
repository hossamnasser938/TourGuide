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
        cafes.add(new Place("Zelzal", "Adnan Malky st", "01015320148"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), cafes, false);

        ListView cafesList = rootView.findViewById(R.id.place_list);

        cafesList.setAdapter(adapter);

        return rootView;

    }

}
