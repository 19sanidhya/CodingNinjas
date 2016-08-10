package com.utilities.sanidhya.codingninjas.data;

/**
 * Created by simra on 27-07-2016.
 */
public class Mentor {
   public  String name;
   public  String qualification;
    public String vision;

    public Mentor(String name, String qualification, String vision) {
        this.name = name;
        this.qualification = qualification;
        this.vision = vision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }
}
