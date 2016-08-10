package com.utilities.sanidhya.codingninjas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sahil on 26/7/16.
 */
public class AskOurExpertsAdapter extends RecyclerView.Adapter<AskOurExpertsAdapter.Holder> {

    Context mContext;
    ArrayList<QuestionsToBeAskedByExperts> questions;

    public AskOurExpertsAdapter(Context mContext, ArrayList<QuestionsToBeAskedByExperts> questions) {
        this.mContext = mContext;
        this.questions = questions;
    }

    public class Holder extends RecyclerView.ViewHolder {
        Button b;
        TextView userName;
        TextView question;

        public Holder(View itemView) {
            super(itemView);
            b = (Button) itemView.findViewById(R.id.upvote_question_to_be_asked_by_our_experts);
            userName = (TextView) itemView.findViewById(R.id.users_name_for_ask_our_experts);
            question = (TextView) itemView.findViewById(R.id.users_question_to_ask_our_experts);
        }
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_questions,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        QuestionsToBeAskedByExperts q = questions.get(position);
        holder.userName.setText(q.getUserName());
        holder.question.setText(q.getQuestionToBeAsked());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

}
