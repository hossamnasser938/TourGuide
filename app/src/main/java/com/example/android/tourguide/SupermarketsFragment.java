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
        superMarkets.add(new Place(getString(R.string.union_market), getString(R.string.minya), getString(R.string.union_phone)));
        superMarkets.add(new Place(getString(R.string.egypt_market), getString(R.string.minya), getString(R.string.egypt_phone)));
        superMarkets.add(new Place(getString(R.string.baraka_market), getString(R.string.malawi), getString(R.string.baraka_phone)));
        superMarkets.add(new Place(getString(R.string.egyptian_food_market), getString(R.string.samaloot), getString(R.string.egyptian_phone)));
        superMarkets.add(new Place(getString(R.string.good_market), getString(R.string.maghagha), getString(R.string.good_phone)));
        superMarkets.add(new Place(getString(R.string.mecca_market), getString(R.string.malawi), getString(R.string.mecca_phone)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), superMarkets, false);

        ListView superMarketsList = rootView.findViewById(R.id.place_list);

        superMarketsList.setAdapter(adapter);

        return rootView;

    }

}
