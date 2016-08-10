package com.utilities.sanidhya.codingninjas.adapters;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.utilities.sanidhya.codingninjas.data.topic;

import java.util.ArrayList;


import com.utilities.sanidhya.codingninjas.R;
import com.utilities.sanidhya.codingninjas.data.topic;

/**
 * Created by simra on 25-07-2016.
 */

public class topicListAdapter extends RecyclerView.Adapter<topicListAdapter.itemHolder> {
    Context context;
    ArrayList<topic> topics;

    public topicListAdapter(Context context, ArrayList<topic> objects) {
        this.context = context;
        topics = objects;
    }

    public class itemHolder extends RecyclerView.ViewHolder {
        TextView topicTextView;
        TextView detailsTextView;
        ImageView image;

        public itemHolder(View itemView) {
            super(itemView);
            topicTextView = (TextView) itemView.findViewById(R.id.topicTextView);
            detailsTextView = (TextView) itemView.findViewById(R.id.topicDetailsTextView);
            image = (ImageView)itemView.findViewById(R.id.topicsImageView);
        }
    }

    @Override
    public topicListAdapter.itemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.topics, parent, false);
        return new itemHolder(view);
    }

    @Override
    public void onBindViewHolder(topicListAdapter.itemHolder holder, int position) {
        topic currentItem = topics.get(position);
        holder.topicTextView.setText(currentItem.topicName);
        holder.detailsTextView.setText(currentItem.topicDetails);
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }
}