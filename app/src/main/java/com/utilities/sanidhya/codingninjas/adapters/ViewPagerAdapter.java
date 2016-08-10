package com.utilities.sanidhya.codingninjas.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.utilities.sanidhya.codingninjas.fragments.CourseCurriculumFragment;
import com.utilities.sanidhya.codingninjas.fragments.CourseFaqsFragment;
import com.utilities.sanidhya.codingninjas.fragments.CourseKeydatesFragment;
import com.utilities.sanidhya.codingninjas.fragments.CourseOverviewFragment;


/**
 * Created by simra on 29-07-2016.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            CourseOverviewFragment courseOverview = new CourseOverviewFragment();
            return courseOverview;
        }
        else if(position == 1)            // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            CourseCurriculumFragment courseCurriculum = new CourseCurriculumFragment();
            return courseCurriculum;
        } else if(position == 2)
        {
            CourseKeydatesFragment courseKeydates = new CourseKeydatesFragment();
            return courseKeydates;
        } else if(position == 3)
        {
            CourseFaqsFragment courseFaqs = new CourseFaqsFragment();
            return courseFaqs;
        } else
        return null;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip
    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
