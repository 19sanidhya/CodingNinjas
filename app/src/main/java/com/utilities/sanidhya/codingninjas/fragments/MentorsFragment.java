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
import com.utilities.sanidhya.codingninjas.activities.MentorsActivity;
import com.utilities.sanidhya.codingninjas.adapters.MentorAdapter;
import com.utilities.sanidhya.codingninjas.data.Mentor;


/**
 * Created by simra on 27-07-2016.
 */
public class MentorsFragment extends Fragment {

    GridView mMentorsGridView;
    ArrayList<Mentor> data;
    MentorAdapter adapter;
    MentorsFragmentListener mListener;

    public interface MentorsFragmentListener {
        void mentorClicked(Mentor m);
    }

    public void setMentorsFragmentListener(MentorsFragmentListener listener) {
        mListener = listener;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mentors, container, false);
        mMentorsGridView = (GridView) v.findViewById(R.id.fragmentMentorsGridView);
        data = new ArrayList<>();

        data.add(new Mentor("Ankush Singla","Qualification","Vision"));
        data.add(new Mentor("Manisha","Qualification","Vision"));
        data.add(new Mentor("Nidhi","Qualification","Vision"));


        adapter = new MentorAdapter(getActivity(), data);
        mMentorsGridView.setAdapter(adapter);
        mMentorsGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Mentor m = data.get(position);
                Intent i2 = new Intent();
                i2.putExtra("name", m.getName());
                i2.putExtra("qualification", m.getQualification());
                i2.putExtra("vision", m.getVision());
                i2.setClass(getActivity(), MentorsActivity.class);
                startActivity(i2);
                //((HomeActivity)getActivity()).mentorClicked();
                //((MentorFragmentListener)getActivity()).mentorClicked((Mentor)parent.getAdapter().getItem(position));

//                if(mListener!=null){
//                    mListener.mentorClicked(m);
//                }
            }
        });
        return v;
    }
}
