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

public class RestaurantFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place("Tweety", "Taha Hussien st, Besides Menia club", "01026589136"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), restaurants, false);

        ListView restaurantsList = rootView.findViewById(R.id.place_list);

        restaurantsList.setAdapter(adapter);

        return rootView;

    }
}
