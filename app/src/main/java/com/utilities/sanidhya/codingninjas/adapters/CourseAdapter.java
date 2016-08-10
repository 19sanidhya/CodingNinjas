package com.utilities.sanidhya.codingninjas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.data.Course;

import java.util.ArrayList;



/**
 * Created by simra on 25-07-2016.
 */
public class CourseAdapter extends ArrayAdapter<Course>{
    Context context;
    ArrayList<Course> arrayList = new ArrayList<Course>();

    public CourseAdapter(Context context, ArrayList<Course> objects) {
        super(context, 0, objects);
        arrayList = objects;
        this.context=context;
    }

    private class CoursesHolder{
        ImageView CourseImageView;
        TextView CoursesTextView;

        public CoursesHolder(ImageView courseImageView, TextView coursesTextView) {
            CourseImageView = courseImageView;
            CoursesTextView = coursesTextView;
        }
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(this.context).inflate(R.layout.courses, parent, false);
            ImageView CourseImageView = (ImageView) v.findViewById(R.id.coursesCourseImageView);
            TextView CourseTextView = (TextView) v.findViewById(R.id.coursesCourseNameTextView);
            CoursesHolder holder = new CoursesHolder(CourseImageView, CourseTextView);
            v.setTag(holder);
        }
        CoursesHolder holder = (CoursesHolder) v.getTag();
        Course currentCourse = arrayList.get(position);
        holder.CoursesTextView.setText(currentCourse.CourseName);
        return v;
    }
}

