package edu.schollj3.exercises05;

public class WagonGame {
    public static String giveMeName() {
        return null;
    }
    public static void main(String[] args) {
        String location = "Nebraska";
        int numOfPeople = 5;

        boolean wonGame = (location.equals("Oregon") && numOfPeople > 0);
        System.out.println("Are ya winning son? " + wonGame);

        location = "Oregon";
        wonGame = (location.equals("Oregon") && numOfPeople > 0);
        System.out.println("How about now? " + wonGame);

        String name = giveMeName();

        if (name != null && name.length() > 10) {
            System.out.println("Length is " + name.length());
        }else{
            System.err.println("INSUFFICIENT!");
        }
    }
}
