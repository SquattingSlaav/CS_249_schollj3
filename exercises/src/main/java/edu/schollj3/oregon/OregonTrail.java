package edu.schollj3.oregon;
import edu.schollj3.exercises03.Supplies;

import java.util.*;

public class OregonTrail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Set who is in the party
        Party party = Party.askForPartyMembers(input);
        //Set the starting supplies
        Supplies supplies = new Supplies();

        System.out.println("Enter starting food: ");
        int food = input.nextInt();
        supplies.addFood(food);
        System.out.println(supplies);

        int milesTraveled = 0;
        double rations = 7;
        int pace = 5;
        int dayCnt = 0;

        // While not dead and not there yet
        while(!isGameOver(party, supplies, milesTraveled)) {

            // Eat food
            boolean fed = eatFoodForDay(party, supplies, rations);

            // Add to distance
            milesTraveled += pace;

            // Add to day count
            dayCnt++;

            // Check if we ran out of food
            // If yes, we instantly perish
            if(!fed) {
                party.killEveryone();
            }

            // Print Status
            printStatus(dayCnt, milesTraveled, party, supplies);
        }
    }
    public static boolean isGameOver(Party party,  Supplies supplies, int milesTraveled) {
        final int MILES_TO_OREGON = 2000;

        return ((milesTraveled >= MILES_TO_OREGON) || (party.getPartyCnt() == 0));
    }

    public static boolean eatFoodForDay(Party party, Supplies supplies, double rations) {
        double foodPerDay = rations*party.getPartyCnt();
        double foodEaten = supplies.removeFood(foodPerDay);

        final double EPS = 1e-7;

        return Math.abs(foodPerDay - foodEaten) < EPS;
    }

    public static void printStatus(int dayCnt, int milesTraveled, Party party, Supplies supplies) {

        String boundary = "*******************";
        System.out.println(boundary);
        System.out.println("DAY " + dayCnt);
        System.out.println(boundary);
        System.out.println("Traveled " + milesTraveled + " miles");
        System.out.println(boundary);
        System.out.println(party);
        System.out.println(boundary);
    }
}
