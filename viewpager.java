/* viewpager: to slide the subactivies.We make separate fragments . In xml
* add component support v7 ViewPAger.
* it needs following files:
* 1) main view pager reference java file and xml file
* 2) fragments java and xml files
* 3) adapter to add fragments on viewpager*/
package com.example.hp.viewpager;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class SampleViewPager extends AppCompatActivity
{
    TextView tv;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_view_pager);
        vp= (ViewPager)findViewById(R.id.vp);
        tv = (TextView)findViewById(R.id.tv);
        MyAdapterViewPager mad = new MyAdapterViewPager(getSupportFragmentManager());   //adapter actually consist of fragments ,set the adapeter on view pager
        vp.setAdapter(mad);

    }

    //code for navigation back in same program independent of view pager

    public void a(View V)
    {
    Intent i = new Intent(this, MainNavigationUp.class);   //navigation up will be there on mainnavigationup java file
    startActivity(i);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
