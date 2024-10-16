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
        for(int i = 0; i < lineC-1; i++) {
            allLines[i] = input.nextLine();
        }
        return new GreetingCard(allLines, boundChar);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GreetingCard n = generateCard(in);
        System.out.println("For any occasion:");
        System.out.println(n);
    }
}
