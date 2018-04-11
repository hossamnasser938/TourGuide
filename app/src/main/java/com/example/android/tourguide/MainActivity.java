package com.example.android.tourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlaceFragmentPagerAdapter adapter = new PlaceFragmentPagerAdapter(getSupportFragmentManager(), getApplicationContext());

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
