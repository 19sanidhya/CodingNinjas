package com.utilities.sanidhya.codingninjas.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.utilities.sanidhya.codingninjas.R;

/**
 * Created by simra on 29-07-2016.
 */
public class CourseKeydatesFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.course_keydates,container,false);
        return v;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        TextView TV1 = (TextView)view.findViewById(R.id.prepcourse);
//        Spannable word1 = new SpannableString("Length:");
//
//        word1.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        TV1.setText(word1);
//        Spannable wordTwo = new SpannableString("20-30 hours");
//
//        wordTwo.setSpan(new ForegroundColorSpan(Color.GRAY), 0, wordTwo.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        TV1.append(wordTwo);


        TextView TV2 = (TextView)view.findViewById(R.id.courseKeydatesApplyTextView);
        Spannable word2 = new SpannableString("Length: ");

        word2.setSpan(new ForegroundColorSpan(Color.BLUE), 0, word2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        TV2.setText(word2);
        Spannable wordTwo2 = new SpannableString(" 20-30 hours");

        wordTwo2.setSpan(new ForegroundColorSpan(Color.GRAY), 0, wordTwo2.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TV2.append(wordTwo2);
    }
}
