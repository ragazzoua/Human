package com.company;

/**
 * created by FAMILY 14.07.2018
 */

public class Man extends Human {
    Human man = new Human();

    public Man(Human man) {
        this.man = man;
    }

    public Man(boolean sex, String name, String surname, float growth, float weight) {
        super(sex, name, surname, growth, weight);
        this.man = man;
    }
}
