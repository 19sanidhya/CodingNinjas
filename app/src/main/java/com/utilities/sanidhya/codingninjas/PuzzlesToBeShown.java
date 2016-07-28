package com.utilities.sanidhya.codingninjas;

/**
 * Created by sahil on 26/7/16.
 */
public class PuzzlesToBeShown {
    String nameForPuzzle;
    String ScoreOfPuzzle;


    public String getNameForPuzzle() {
        return nameForPuzzle;
    }

    public void setNameForPuzzle(String nameForPuzzle) {
        this.nameForPuzzle = nameForPuzzle;
    }

    public String getScoreOfPuzzle() {
        return ScoreOfPuzzle;
    }

    public void setScoreOfPuzzle(String scoreOfPuzzle) {
        ScoreOfPuzzle = scoreOfPuzzle;
    }

    public PuzzlesToBeShown(String nameForPuzzle, String scoreOfPuzzle) {

        this.nameForPuzzle = nameForPuzzle;
        ScoreOfPuzzle = scoreOfPuzzle;
    }
}
