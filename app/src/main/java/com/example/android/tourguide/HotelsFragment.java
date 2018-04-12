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

    public HotelsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> hotels = new ArrayList<>();
        hotels.add(new Place(getString(R.string.omar_elkhayam), getString(R.string.ibn_khaseeb_st), getString(R.string.omar_elkhayam_phone)));
        hotels.add(new Place(getString(R.string.nefertiti), getString(R.string.raha_hussien_st), getString(R.string.nefertiti_phone)));
        hotels.add(new Place(getString(R.string.armed_forces), getString(R.string.korneesh_st), getString(R.string.armed_phone)));
        hotels.add(new Place(getString(R.string.ikhnatoon), getString(R.string.besides_to_police_station), getString(R.string.ikhnaton_phone)));
        hotels.add(new Place(getString(R.string.grand_aton), getString(R.string.besides_to_horus), getString(R.string.grand_aton_phone)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), hotels, false);

        ListView hotelsList = rootView.findViewById(R.id.place_list);

        hotelsList.setAdapter(adapter);

        return rootView;

    }

}
