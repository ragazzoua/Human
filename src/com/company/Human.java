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

    public void isPerson() {

        System.out.println("Введите данные для первой особи");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sex ");
        boolean sex = scanner.nextBoolean();
        System.out.println("Sex " + sex);
        System.out.println("Name ");
        String name = scanner.next();
        System.out.println("Name " + name);
        System.out.println("Surname ");
        String surname = scanner.next();
        System.out.println("Surname " + surname);
        System.out.println("Growth ");
        float growth = scanner.nextFloat();
        System.out.println("Growth " + growth);
        System.out.println("Weight ");
        float weight = scanner.nextFloat();
        System.out.println("Weight " + weight);


    }

    public void isSecondPerson() {

        System.out.println("Введите данные для второй особи");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sex ");
        boolean sex = scanner.nextBoolean();
        System.out.println("Sex " + sex);
        System.out.println("Name ");
        String name = scanner.next();
        System.out.println("Name " + name);
        System.out.println("Surname ");
        String surname = scanner.next();
        System.out.println("Surname " + surname);
        System.out.println("Growth ");
        float growth = scanner.nextFloat();
        System.out.println("Growth " + growth);
        System.out.println("Weight ");
        float weight = scanner.nextFloat();
        System.out.println("Weight " + weight);


    }

}
