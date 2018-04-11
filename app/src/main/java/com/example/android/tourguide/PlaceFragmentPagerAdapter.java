package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Hosam on 4/11/2018.
 */

public class PlaceFragmentPagerAdapter extends FragmentPagerAdapter {

    Context context;

    public PlaceFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return context.getString(R.string.restaurants);
            case 1:
                return context.getString(R.string.hotels);
            case 2:
                return context.getString(R.string.cafes);
            default:
                return context.getString(R.string.supermarkets);
        }
    }
}
