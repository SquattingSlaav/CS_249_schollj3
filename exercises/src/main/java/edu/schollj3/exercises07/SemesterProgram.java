package edu.schollj3.exercises07;

import java.util.*;

public class SemesterProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of students: ");
        int studentCnt = input.nextInt();

        for(int i = 0; i < studentCnt; i++) {
            double r = Math.random();
            int score = 50 + (int)(51*r);
            //String letter = GradingUtil.getGradeLetter(score);
            //System.out.println("Student " + (i+1) + ": " + score + " (" + letter + ") ");
        }
    }
}
