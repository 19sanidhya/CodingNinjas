package com.utilities.sanidhya.codingninjas.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.utilities.sanidhya.codingninjas.AskOurExperts;
import com.utilities.sanidhya.codingninjas.HomeFragment;
import com.utilities.sanidhya.codingninjas.PuzzleOfTheDay;
import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.fragments.*;
import com.utilities.sanidhya.codingninjas.data.Course;
import com.utilities.sanidhya.codingninjas.data.Mentor;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener/*, CoursesFragment.CoursesFragmentListener,MentorsFragment.MentorsFragmentListener */{

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    String phoneNumber = "tel:+919205139805";
    TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.view_pager_container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


        //THIS LISTENER IS NOT WORKING!!!PLEASE CHECK THIS


        FrameLayout fl = (FrameLayout) findViewById(R.id.fragment_tabs_container);

        FragmentTransaction ftCourse = getSupportFragmentManager().beginTransaction();
        CoursesFragment cf = new CoursesFragment();
        if(fl == null){
            ftCourse.add(R.id.fragment_tabs_container,cf,"CourseTag");
        }
        else {
            ftCourse.replace(R.id.fragment_tabs_container, cf, "CourseTag");
        }
//            cf.setCoursesFragmentListener(this);
            ftCourse.commit();





        FragmentTransaction ftMentor = getSupportFragmentManager().beginTransaction();
        MentorsFragment mf = new MentorsFragment();
        ftMentor.replace(R.id.fragment_tabs_container, new MentorsFragment(), "MentorTag");
//        mf.setMentorsFragmentListener(this);
        ftMentor.commit();




//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_call_us) {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            Uri uri = Uri.parse(phoneNumber);
            intent.setData(uri);
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return true;
            }
            startActivity(intent);
        }
        if (id == R.id.action_mail_us) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            Uri uri = Uri.parse("mailto:contact@codingninjas.in");
            intent.setData(uri);
            startActivity(intent);
        }
        if (id == R.id.action_faq) {
            Intent intent = new Intent(MainActivity.this, FAQsActivity.class);
            startActivity(intent);
        }
         if (id == R.id.action_rate_us) {
            return true;
        }
         if (id == R.id.action_invite_and_earn) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(id == R.id.nav_home){
            tabLayout.getTabAt(0);
            tabLayout.setupWithViewPager(mViewPager);

        }
        else if (id == R.id.nav_puzzle_of_the_day) {
            Intent intent = new Intent(this,PuzzleOfTheDay.class);
            startActivity(intent);

        } else if (id == R.id.nav_find_ninja_friends) {

            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_upcoming_events) {

        } else if (id == R.id.nav_upcoming_batches) {

        } else if (id == R.id.nav_ask_our_experts) {
            Intent intent = new Intent(this,AskOurExperts.class);;
            startActivity(intent);

        } else if (id == R.id.nav_register) {
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_sign_in) {
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
//
//    @Override
//    public void courseClicked(Course c) {
//        Intent i1 = new Intent();
//        i1.putExtra("name",c.getCourseName());
//        i1.putExtra("title",c.getTitle());
//        i1.setClass(this, CourseActivity.class);
//        startActivity(i1);
//    }
//
//    @Override
//    public void mentorClicked(Mentor m) {
//        Intent i2 = new Intent();
//        i2.putExtra("name",m.getName());
//        i2.putExtra("qualification",m.getQualification());
//        i2.putExtra("vision",m.getVision());
//        i2.setClass(this, MentorsActivity.class);
//        startActivity(i2);
//    }

//    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
//        private static final String ARG_SECTION_NUMBER = "section_number";
//
//        public PlaceholderFragment() {
//        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
//        public static PlaceholderFragment newInstance(int sectionNumber) {
//            PlaceholderFragment fragment = new PlaceholderFragment();
//            Bundle args = new Bundle();
//            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//            fragment.setArguments(args);
//            return fragment;
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.content_main, container, false);

//            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

//
//            FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.fragment_tabs_container);
//
//            HomeFragment hf = new HomeFragment();
//            getFragmentManager().beginTransaction().replace(R.id.fragment_tabs_container,hf).commit();
//            return rootView;

//        }
//    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0 :

                        return new HomeFragment();

                case 1 :

                    return new CoursesFragment();

                case 2:

                        return new MentorsFragment();

            }
            return new HomeFragment();
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "HOME";
                case 1:
                    return "COURSES";
                case 2:
                    return "MENTORS";
            }
            return null;
        }
    }
}
