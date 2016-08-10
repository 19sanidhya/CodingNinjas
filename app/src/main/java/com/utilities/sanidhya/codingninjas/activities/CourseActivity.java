package com.utilities.sanidhya.codingninjas.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.SlidingTabLayout;
import com.utilities.sanidhya.codingninjas.adapters.ViewPagerAdapter;


//import static in.simransarin.codingninjas.ExpandableListAdapter.setListViewHeightBasedOnItems;

public class CourseActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence titles[]={"Overview","Curriculum","Key Dates", "FAQs"};
    int Numboftabs =4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        // Creating The Toolbar and setting it as the Toolbar for the activity
        toolbar = (Toolbar) findViewById(R.id.courseToolbar);
        setSupportActionBar(toolbar);


        // Creating The ViewPagerAdapter and Passing Fragment Manager, titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerAdapter(getSupportFragmentManager(), titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.courseViewPager);
        if (pager != null) {
            pager.setAdapter(adapter);
        }

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.courseSlidingTabLayout);
        if (tabs != null) {
            tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
        }

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.black);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
    }

}
