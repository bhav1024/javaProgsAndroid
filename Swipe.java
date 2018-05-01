//main
package com.example.hp.swipeview;


import android.app.ActionBar;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ViewPager vp;
    TabLayout tl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager)findViewById(R.id.vp);
        tl = (TabLayout)findViewById(R.id.tl);

        MyAdapter md = new MyAdapter(getSupportFragmentManager());
        vp.setAdapter(md);

        tl.setupWithViewPager(vp);   //add viewpager to tablayout and its done


    }

}

//myAdapter.java
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by USER on 07-Apr-18.
 */

public class MyAdapter extends FragmentStatePagerAdapter {

    MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment1 f1 = new Fragment1();

        Bundle b = new Bundle();
        b.putInt("Key1",(position+1));
        f1.setArguments(b);

        return f1;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String s ="";
        switch (position)
        {
            case 0: s = "Tab1";
                break;
            case 1: s = "Tab2";
                break;
            case 2: s= "Tab3";
                break;

        }

        return s;
    }
}