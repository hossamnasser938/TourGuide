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
        restaurants.add(new Place("ElMohamady", "Hasib st", "01026589136"));
        restaurants.add(new Place("Cook Door", "Adnan ElMalki st", "01113652479"));
        restaurants.add(new Place("Mcdonald's", "Korneesh st", "01023654125"));
        restaurants.add(new Place("Bondoka Koshary", "Tah Hussien st", "01125697485"));
        restaurants.add(new Place("Hi Proust", "Street 14", "01158910237"));
        restaurants.add(new Place("Elkhaleel", "Korneesh st", "01026794050"));
        restaurants.add(new Place("KFC", "Korneesh st", "01125301450"));
        restaurants.add(new Place("Toscanini", "Korneesh st", "01036571000"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), restaurants, false);

        ListView restaurantsList = rootView.findViewById(R.id.place_list);

        restaurantsList.setAdapter(adapter);

        return rootView;

    }
}
