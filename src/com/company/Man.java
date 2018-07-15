package com.company;

/**
 * created by FAMILY 14.07.2018
 */

public class Man extends Human {
    Human man = new Human(true);

    public Man( boolean sex) {
        super(sex);
    }

    public Man(boolean sex, String name, String surname, float growth, float weight, Human man) {
        super(sex, name, surname, growth, weight);
        this.man = man;
    }

    @Override
    public String toString() {
        return "Man{" +
                "man=" + man +
                '}';
    }
}
