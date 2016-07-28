package com.utilities.sanidhya.codingninjas;

/**
 * Created by sahil on 26/7/16.
 */
public class QuestionsToBeAskedByExperts {

    int upvote;
    String userName;
    String questionToBeAsked;

    public int getUpvote() {
        return upvote;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionToBeAsked() {
        return questionToBeAsked;
    }

    public void setQuestionToBeAsked(String questionToBeAsked) {
        this.questionToBeAsked = questionToBeAsked;
    }

    public QuestionsToBeAskedByExperts(int upvote, String userName, String questionToBeAsked) {

        this.upvote = upvote;
        this.userName = userName;
        this.questionToBeAsked = questionToBeAsked;
    }
}
