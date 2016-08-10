package com.utilities.sanidhya.codingninjas.data;

/**
 * Created by simra on 25-07-2016.
 */
public class Course {
    public String CourseName;
    public String title;

    public Course(String courseName, String title) {
        CourseName = courseName;
        this.title = title;
    }

    public Course(String courseName) {
        CourseName = courseName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
