package com.company;

/**
 * created by FAMILY 14.07.2018
 */

public class Human {
    private boolean sex;
    private String name;
    private String surname;
    private float growth;
    private float weight;


    private int relations;

    public Human() {
    }

    public Human(boolean sex, String name, String surname, float growth, float weight) {

    }

    public boolean say(boolean conversation) {
        if (conversation == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean societyYes(boolean society) {
        if (society == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean spentTime(boolean time) {
        if (time == true) {
            return true;
        } else {
            return false;
        }
    }

    public Human haveRelations() {
        return new Human();
    }

}
