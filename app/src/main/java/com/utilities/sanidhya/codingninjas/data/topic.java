package com.utilities.sanidhya.codingninjas.data;

/**
 * Created by simra on 25-07-2016.
 */
public class topic {
    public String topicName;
    public String topicDetails;

    public topic(String topicName, String topicDetails) {
        this.topicName = topicName;
        this.topicDetails = topicDetails;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDetails() {
        return topicDetails;
    }

    public void setTopicDetails(String topicDetails) {
        this.topicDetails = topicDetails;
    }
}
