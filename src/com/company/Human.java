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
    private boolean conversation;
    private boolean society;
    private boolean time;
    private int relations;

    public Human() {
    }

    public boolean say() {
        if (conversation = true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean societyYes() {
        if (society = true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean spentTime() {
        if (time = true) {
            return true;
        } else {
            return false;
        }
    }

    public Human haveRelations() {
        return new Human();
    }

}
