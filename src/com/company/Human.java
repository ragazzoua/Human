package com.company;

import java.util.Scanner;

/**
 * created by FAMILY 14.07.2018
 */

public class Human {
    private boolean sex;
    private String name;
    private String surname;
    private float growth;
    private float weight;


    public Human(boolean sex) {

    }

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

    Scanner scanner = new Scanner(System.in);


    public void isPerson(boolean sex, String name, String surname, float growth, float weight) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Введите данные для особи");

            System.out.println("Sex " + sex);
            scanner.nextLine();
            System.out.println("Name" + name);
        }


    }

    public void isPerson() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Введите данные для двух особей");
            Scanner scanner = new Scanner(System.in);
            boolean sex = scanner.nextBoolean();
            System.out.println("Sex " + sex);
            String name = scanner.next();
            System.out.println("Name " + name);
            String surname = scanner.next();
            System.out.println("Surname " + surname);
            float growth = scanner.nextFloat();
            System.out.println("Growth " + growth);
            float weight = scanner.nextFloat();
            System.out.println("weight " + weight);
        }

    }

}
