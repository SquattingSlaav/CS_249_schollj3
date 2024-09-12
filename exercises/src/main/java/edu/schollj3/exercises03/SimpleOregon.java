package edu.schollj3.exercises03;

import java.util.*;

public class SimpleOregon {
    public static void main (String[] args) {
        System.out.println("WELCOME!");

        Supplies supplies = new Supplies();
        System.out.println(supplies);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter food: ");
        double totalFood = input.nextDouble();

        System.out.println("Enter # of people: ");
        int numPeople = input.nextInt();

        System.out.println("Enter rations: ");
        int ration = input.nextInt();

        double totalDays = totalFood/(numPeople*ration);

        System.out.println("TOTAL DAYS: " + totalDays);
    }
}
