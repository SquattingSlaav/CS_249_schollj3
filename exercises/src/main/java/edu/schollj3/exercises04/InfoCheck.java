package edu.schollj3.exercises04;

import java.util.*;

public class InfoCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Enter age and height: ");
        //String dataLine = input.nextLine();

        //Scanner parseLine = new Scanner(dataLine);
        //int age = parseLine.nextInt();
        //int height = parseLine.nextInt();
        int age = input.nextInt();
        int height = input.nextInt();
        input.nextLine();

        System.out.println("Enter address: ");
        String address = input.nextLine();

        System.out.println("NAME: " + name);
        System.out.println("AGE: " +age);
        System.out.println("HEIGHT: " + height);
        System.out.println("ADDRESS: " + address);
    }
}
