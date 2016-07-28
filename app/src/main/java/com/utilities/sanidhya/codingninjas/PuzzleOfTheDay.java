package com.utilities.sanidhya.codingninjas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

/**
 * Created by sahil on 25/7/16.
 */
public class PuzzleOfTheDay extends AppCompatActivity {
    RecyclerView recyclerView;
    PuzzleOfTheDayScoresAdapter adapter;
    ArrayList<PuzzlesToBeShown> puzzleScores ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_of_the_day);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recyler_puzzle_friends_score);

        puzzleScores = new ArrayList<>();


        puzzleScores.add(new PuzzlesToBeShown("name1","Score1"));
        puzzleScores.add(new PuzzlesToBeShown("name2","Score2"));
        puzzleScores.add(new PuzzlesToBeShown("name3","Score3"));
        puzzleScores.add(new PuzzlesToBeShown("name4","Score4"));
        puzzleScores.add(new PuzzlesToBeShown("name5","Score5"));

        adapter = new PuzzleOfTheDayScoresAdapter(this,puzzleScores);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lm);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            onBackPressed();
            return true;
    }

}
