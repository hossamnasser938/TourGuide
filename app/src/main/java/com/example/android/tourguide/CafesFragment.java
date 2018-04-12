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
        cafes.add(new Place(getString(R.string.solo_cafe), getString(R.string.raha_hussien_st), getString(R.string.solo_phone)));
        cafes.add(new Place(getString(R.string.mo_lounge), getString(R.string.inside_city_skape_mall), getString(R.string.mo_lounge_phone)));
        cafes.add(new Place(getString(R.string.lyaly_libnan), getString(R.string.libnan_square_st), getString(R.string.lyaly_phone)));
        cafes.add(new Place(getString(R.string.zelzal), getString(R.string.korneesh_st), getString(R.string.zelzal_phone)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), cafes, false);

        ListView cafesList = rootView.findViewById(R.id.place_list);

        cafesList.setAdapter(adapter);

        return rootView;

    }

}
