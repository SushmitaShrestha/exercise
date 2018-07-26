package com.example.sushmita.exercise;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
/**
 * Sushmita Shrestha - 16366
 */
public class Home extends AppCompatActivity {

    //variables
    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //adding toolbar
        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.pager);
        tablayout = findViewById(R.id.tab);


        TabLayoutAdapter obj = new TabLayoutAdapter(getSupportFragmentManager());
        viewPager.setAdapter(obj);
        tablayout.setupWithViewPager(viewPager);
    }

}
