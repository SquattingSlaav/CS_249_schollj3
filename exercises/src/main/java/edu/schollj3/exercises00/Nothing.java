package edu.schollj3.exercises00;

import edu.schollj3.items.*;

public class Nothing {
    public static void main(String [] args) {
        Weapon w = new Weapon();

        NPC bob = new NPC();
        NPC susan = new NPC("SUSAN");

        System.out.println("Bob's health: " + bob.getHealth());

        bob.setHealth(50);
        System.out.println("Bob's health again: " + bob.getHealth());
        System.out.println("Susan's health: " + susan.getHealth());
    }
}
