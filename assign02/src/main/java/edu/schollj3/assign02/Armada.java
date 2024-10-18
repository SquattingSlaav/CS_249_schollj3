package edu.schollj3.assign02;

import java.util.*;

public class Armada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SpaceVessel vessel = new SpaceVessel();

        System.out.println("Enter vessel name:");
        String name = sc.nextLine();

        System.out.println("Enter length and weight:");
        String line = sc.nextLine();
        Scanner parseLine = new Scanner(line);

        int ft = parseLine.nextInt();
        int lbs = parseLine.nextInt();

        vessel.setName(name);
        vessel.setLength(ft);
        vessel.setWeight(lbs);

        System.out.println(vessel);
    }
}

