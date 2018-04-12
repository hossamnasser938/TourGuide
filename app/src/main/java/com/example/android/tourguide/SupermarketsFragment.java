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

public class SupermarketsFragment extends Fragment {

    public SupermarketsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> superMarkets = new ArrayList<>();
        superMarkets.add(new Place("Union Markets", "Minya", "01126020307"));
        superMarkets.add(new Place("Egypt Markets", "Minya", "01236795412"));
        superMarkets.add(new Place("Baraka Markets", "Malawi", "01120300894"));
        superMarkets.add(new Place("Egyptian Food Markets", "Samaloot", "01200365978"));
        superMarkets.add(new Place("Good Markets", "Maghagha", "01025493491"));
        superMarkets.add(new Place("Mecca Markets", "Malawi", "0120620409"));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), superMarkets, false);

        ListView superMarketsList = rootView.findViewById(R.id.place_list);

        superMarketsList.setAdapter(adapter);

        return rootView;

    }

}
