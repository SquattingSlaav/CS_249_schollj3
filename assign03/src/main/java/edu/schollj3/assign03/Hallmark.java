package edu.schollj3.assign03;

import java.util.*;

public class Hallmark {
    public static GreetingCard generateCard(Scanner input) {
        System.out.println("Enter boundary character:");
        char boundChar = input.nextLine().charAt(0);

        System.out.println("Enter number of lines:");
        String line = input.nextLine();
        int lineC = Integer.parseInt(line);

        String[] allLines = new String[lineC];
        System.out.println("Enter lines:");
        for(int i = 0; i < lineC; i++) {
            allLines[i] = input.nextLine();
        }
        GreetingCard card = new GreetingCard(allLines, boundChar);
        return card;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GreetingCard card = generateCard(in);
        System.out.println("For any occasion:");
        System.out.println(card);
    }
}
