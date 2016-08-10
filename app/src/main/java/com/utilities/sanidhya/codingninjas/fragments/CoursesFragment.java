package com.utilities.sanidhya.codingninjas.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.activities.CourseActivity;
import com.utilities.sanidhya.codingninjas.adapters.CourseAdapter;
import com.utilities.sanidhya.codingninjas.data.Course;

/**
 * Created by simra on 25-07-2016.
 */
public class CoursesFragment extends Fragment {

    GridView mCourseGridView;
    ArrayList<Course> data;
    CourseAdapter adapter;
    CoursesFragmentListener mListener;

    public interface CoursesFragmentListener {
        void courseClicked(Course c);
    }

    public void setCoursesFragmentListener(CoursesFragmentListener listener) {
        mListener = listener;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_courses, container, false);
        mCourseGridView = (GridView) v.findViewById(R.id.fragmentCoursesGridView);
        data = new ArrayList<>();

        data.add(new Course("Inception","C++ Foundation & Data Structures"));
        data.add(new Course("Alchemy","Web Developement"));
        data.add(new Course("Nucleus","Java Foundation & Data Structures"));


        adapter = new CourseAdapter(getActivity(), data);
        mCourseGridView.setAdapter(adapter);
        mCourseGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Course c = data.get(position);
                Intent i1 = new Intent();
                i1.putExtra("name",c.getCourseName());
                i1.putExtra("title",c.getTitle());
                i1.setClass(getActivity(), CourseActivity.class);
                startActivity(i1);
                //((HomeActivity)getActivity()).courseClicked();
                //((CourseFragmentListener)getActivity()).courseClicked((Course)parent.getAdapter().getItem(position));
//
//                if (mListener != null) {
//                    mListener.courseClicked(c);
//                }
            }
        });
        return v;
    }
}
