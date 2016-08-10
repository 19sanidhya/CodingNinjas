package com.utilities.sanidhya.codingninjas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sahil on 26/7/16.
 */
public class PuzzleOfTheDayScoresAdapter extends RecyclerView.Adapter<PuzzleOfTheDayScoresAdapter.Holder> {

    Context mContext;
    ArrayList<PuzzlesToBeShown> puzzleScores;

    public PuzzleOfTheDayScoresAdapter(Context mContext, ArrayList<PuzzlesToBeShown> puzzleScores) {
        this.mContext = mContext;
        this.puzzleScores = puzzleScores;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView userName;
        TextView score;

        public Holder(View itemView) {
            super(itemView);
            userName = (TextView) itemView.findViewById(R.id.puzzle_person_name);
            score = (TextView) itemView.findViewById(R.id.puzzle_person_score);
        }
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_puzzle_scores,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        PuzzlesToBeShown p = puzzleScores.get(position);
        holder.userName.setText(p.getNameForPuzzle());
        holder.score.setText(p.getScoreOfPuzzle());
    }

    @Override
    public int getItemCount() {
        return puzzleScores.size();
    }
}
