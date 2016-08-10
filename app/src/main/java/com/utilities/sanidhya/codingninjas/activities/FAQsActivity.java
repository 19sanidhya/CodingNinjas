package com.utilities.sanidhya.codingninjas.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.adapters.FAQListAdapter;

public class FAQsActivity extends AppCompatActivity {
    FAQListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.faqListView);

        // preparing list data
        prepareListData();
        //setListViewHeightBasedOnItems(expListView);

        listAdapter = new FAQListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Question1");
        listDataHeader.add("Question2");
        //listDataHeader.add("");

        // Adding child data
        List<String> q1 = new ArrayList<String>();
        q1.add("Answer");

        List<String> q2 = new ArrayList<String>();
        q2.add("Answer");

        listDataChild.put(listDataHeader.get(0), q1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), q2);
        //listDataChild.put(,);
    }

}
