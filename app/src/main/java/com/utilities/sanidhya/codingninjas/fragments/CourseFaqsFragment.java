package com.utilities.sanidhya.codingninjas.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.adapters.CourseFaqListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by simra on 29-07-2016.
 */
public class CourseFaqsFragment extends android.support.v4.app.Fragment {
    CourseFaqListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Question : After doing this course, will I be able to do competitive coding on portals like Code Chef?");
        listDataHeader.add("Question : I had C++ in 12th class, is this course beneficial for me also?");
        //listDataHeader.add("");

        // Adding child data
        List<String> q1 = new ArrayList<String>();
        q1.add("Absolutely! Also,as a part of the course, you will solve 250+ problems of varying difficulty on our Automated Code Checking tool. The tool simulates actual test environment of competitive coding portals, hackathons and coding tests for placements.");

        List<String> q2 = new ArrayList<String>();
        q2.add("The course introduces you to programming from an entirely different perspective which lays ground on making programming fun! Having studied C++ in 12th Class, you may feel a little deja vu during the first 3-4 classes, after that OOPs and Data Structures come to main focus which are not a part of Class 12 C++ curriculum.");

        listDataChild.put(listDataHeader.get(0), q1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), q2);
        //listDataChild.put(,);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.course_faqs,container,false);
        return v;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // get the listview
        expListView = (ExpandableListView)view.findViewById(R.id.courseFaqListView);

        // preparing list data
        prepareListData();
        //setListViewHeightBasedOnItems(expListView);

        listAdapter = new CourseFaqListAdapter(getActivity(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
}
