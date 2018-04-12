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

    public RestaurantFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place(getString(R.string.elmohamady), getString(R.string.hasib_st), getString(R.string.elmohamady_phone), R.drawable.elmohamadi));
        restaurants.add(new Place(getString(R.string.cook_door), getString(R.string.adnan_elmalki_st), getString(R.string.cook_door_phone), R.drawable.cook_door));
        restaurants.add(new Place(getString(R.string.mcdonalds), getString(R.string.korneesh_st), getString(R.string.mcdonalds_phone), R.drawable.mcdonalds));
        restaurants.add(new Place(getString(R.string.bondoka), getString(R.string.raha_hussien_st), getString(R.string.bondoka_phone), R.drawable.bondoka));
        restaurants.add(new Place(getString(R.string.hi_proust), getString(R.string.street_14), getString(R.string.hi_proust_phone), R.drawable.hi_proust));
        restaurants.add(new Place(getString(R.string.elkhaleel), getString(R.string.korneesh_st), getString(R.string.elkhaleel_phone), R.drawable.elkhaleel));
        restaurants.add(new Place(getString(R.string.kfc), getString(R.string.korneesh_st), getString(R.string.kfc_phone), R.drawable.kfc));
        restaurants.add(new Place(getString(R.string.toscanini), getString(R.string.korneesh_st), getString(R.string.toscanini_phone), R.drawable.toscanini));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), restaurants, true);

        ListView restaurantsList = rootView.findViewById(R.id.place_list);

        restaurantsList.setAdapter(adapter);

        return rootView;

    }
}
