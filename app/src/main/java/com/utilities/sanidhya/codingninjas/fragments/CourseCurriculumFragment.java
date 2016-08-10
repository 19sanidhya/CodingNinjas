package com.utilities.sanidhya.codingninjas.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.adapters.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by simra on 29-07-2016.
 */
public class CourseCurriculumFragment extends android.support.v4.app.Fragment {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(com.utilities.sanidhya.codingninjas.R.layout.fragment_course_curriculum,container,false);
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // get the listview
        expListView = (ExpandableListView) view.findViewById(R.id.fragmentCourseCurriculumListView);

        // preparing list data
        prepareListData();
        //setListViewHeightBasedOnItems(expListView);

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Class 1 To 5 : Logic Building and Programming Fundamentals");
        listDataHeader.add("Class 6 To 11 : Recursion, Time Complexity Analysis and Object Oriented Programming");
        //listDataHeader.add("Class 12 To 18 : Data Structures");

        // Adding child data
        List<String> class1to5 = new ArrayList<String>();
        class1to5.add("In initial classes focus will be on logic building and getting familiar with basic programming fundamentals. " +
                "\n"+"Logic Building");
        class1to5.add("Flowcharts and Pseudocode");
        class1to5.add("Basic C++ syntax");
        class1to5.add("Loops");
        class1to5.add("Functions");
        class1to5.add("Arrays");
        class1to5.add("Pointers");

        List<String> class6to11 = new ArrayList<String>();
        class6to11.add("Now that we are accustomed with basics, in this phase of the course we will move on to interesting and important topics for enhancing your programming skills. The topics covered will be the backbone for the rest of the course and are also crucial from interview perspective.");
        class6to11.add("Order Complexity Analysis");
        class6to11.add("Recursion");
        class6to11.add("OOPS");

        listDataChild.put(listDataHeader.get(0), class1to5); // Header, Child data
        listDataChild.put(listDataHeader.get(1), class6to11);
        //listDataChild.put(listDataHeader.get(2), );
    }
}
