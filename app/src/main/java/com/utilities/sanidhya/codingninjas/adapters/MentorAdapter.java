package com.utilities.sanidhya.codingninjas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.data.Mentor;

/**
 * Created by simra on 27-07-2016.
 */
public class MentorAdapter extends ArrayAdapter<Mentor> {
    Context context;
    ArrayList<Mentor> arrayList = new ArrayList<Mentor>();

    public MentorAdapter(Context context, ArrayList<Mentor> objects) {
        super(context, 0, objects);
        arrayList = objects;
        this.context=context;
    }

    private class MentorsHolder{
        ImageView MentorImageView;
        TextView MentorTextView;

        public MentorsHolder(ImageView mentorImageView, TextView mentorTextView) {
            MentorImageView = mentorImageView;
            MentorTextView = mentorTextView;
        }
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(this.context).inflate(R.layout.mentors, parent, false);
            ImageView MentorImageView = (ImageView) v.findViewById(R.id.mentorsImageView);
            TextView MentorTextView = (TextView) v.findViewById(R.id.mentorsNameTextView);
            MentorsHolder holder = new MentorsHolder(MentorImageView, MentorTextView);
            v.setTag(holder);
        }
        MentorsHolder holder = (MentorsHolder) v.getTag();
        Mentor currentMentor = arrayList.get(position);
        holder.MentorTextView.setText(currentMentor.name);
        return v;
    }
}
