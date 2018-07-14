package com.company;

/**
 * created by FAMILY 14.07.2018
 */

public class Woman extends Human {
    Human woman = new Human();
    Human newHuman = new Human();

    public Woman() {
    }

    public Human born() {
        return newHuman;
    }


}
