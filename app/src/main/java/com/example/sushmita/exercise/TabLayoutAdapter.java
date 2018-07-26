package com.example.sushmita.exercise;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Sushmita Shrestha - 16366
 */

public class TabLayoutAdapter extends FragmentStatePagerAdapter {
    public TabLayoutAdapter(FragmentManager fm) {
        super(fm);
    }

    // switch cases
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                MondayDayFragment mon = new MondayDayFragment();
                return mon;
            case 1:
                TuesdayDayFragment tues = new TuesdayDayFragment();
                return tues;
            case 2:
                RestDayFragment res = new RestDayFragment();
                return res;
            case 3:
                ThursdayDayFragment wed = new ThursdayDayFragment();
                return wed;
            case 4:
                FridayDayFragment fri = new FridayDayFragment();
                return fri;
            case 5:
                RestDayFragment res1 = new RestDayFragment();
                return res1;
            case 6:
                SundayDayFragment sat = new SundayDayFragment();
                return sat;

            default: return null;
        }
    }

    //switch cases
    @Override
    public int getCount() {
        return 7;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Monday";
            case 1:return "Tuesday";
            case 2:return "Wednesday";
            case 3:return "Thursday";
            case 4:return "Friday";
            case 5:return "Saturday";
            case 6:return "Sunday";
            default: return null;
        }

    }
}
