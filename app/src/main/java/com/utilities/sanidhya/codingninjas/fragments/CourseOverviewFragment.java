package com.utilities.sanidhya.codingninjas.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.adapters.topicListAdapter;
import com.utilities.sanidhya.codingninjas.data.topic;


/**
 * Created by simra on 29-07-2016.
 */
public class CourseOverviewFragment extends android.support.v4.app.Fragment{

    TextView name;
    TextView title;
    RecyclerView recyclerView;
    topicListAdapter adapter;
    ArrayList<topic> arrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.course_overview,container,false);
        return v;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayList = new ArrayList<>();
        name = (TextView)view.findViewById(R.id.courseOverviewNameTextView);
        title = (TextView)view.findViewById(R.id.courseOverviewTitleTextView);
        String courseName = getActivity().getIntent().getStringExtra("name");
        String titleName = getActivity().getIntent().getStringExtra("title");

        if(name!=null && title!=null){
            name.setText(courseName);
            title.setText(titleName);
        }

        arrayList.add(new topic("Logic Building","\n" +
                "Programming is mainly logic. It is said that if you have good logical abilities, you can become a good programmer."));
        arrayList.add(new topic("OOPs Concepts","\n"+
                "OOP offers several benefits to the program designer and the user. Object-orientation contributes to the solutions of many problem associated with the development and quality of software products."));
        arrayList.add(new topic("Programming Fundamentals","\n" +
                "For most programming languages the concepts are all the same. Therefore it is must to understand programming fundamentals."));
        arrayList.add(new topic("Data Structures","\n" +
                "Data structure is an arrangement of data in a computer's memory or even disk storage. The use of data structures and algorithms is the nuts-and-bolts used by programmers to store and manipulate data."));

        adapter = new topicListAdapter(getActivity(),arrayList);

        recyclerView = (RecyclerView)view.findViewById(R.id.courseOverviewWhatYouWillLearnRecyclerView);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        //recyclerView.setLayoutManager(new LinearLayoutManager(CourseActivity.this));
        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(lm);
    }
    }
