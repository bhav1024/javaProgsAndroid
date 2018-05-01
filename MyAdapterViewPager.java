package com.example.hp.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by USER on 21-Mar-18.
 */

public class MyAdapterViewPager extends FragmentStatePagerAdapter {


    public MyAdapterViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
       Fragment f = null;
       switch (position)
       {
           case 0: f =new Fragment1ViewPager();
           break;
           case 1: f =new FragmentViewPager();
           break;
           case 2: f =new Fragment1ViewPager();
           break;
           case 3: f =new FragmentViewPager();
           break;
           case 4: f =new Fragment1ViewPager();
           break;
       }

        return f;

    }

    @Override
    public int getCount() {
        return 5;
    }
}
