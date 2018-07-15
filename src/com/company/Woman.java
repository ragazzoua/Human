package com.company;

/**
 * created by FAMILY 14.07.2018
 */

public class Woman extends Human {
    Human woman = new Human(false);

    public Woman() {
    }

    public Woman(boolean sex) {
        super(sex);

    }

    public Woman(boolean sex, String name, String surname, float growth, float weight, Human woman) {
        super(sex, name, surname, growth, weight);
        this.woman = woman;
    }

    private Human born() {
        return new Human();
    }

    @Override
    public String toString() {
        return "Woman{" +
                "woman=" + woman +
                '}';
    }
}
