package edu.schollj3.exercises00;

import edu.schollj3.items.*;

public class NPC {
    public final double PI = 3.14;

    private int health = 100;
    private String name = "";

    public NPC() {

    }

    public NPC(String n) {
        name = n;
    }

    public int getHealth() {
        return health;
    }

    public boolean setHealth(int h) {
        if (h>=0 && h<=100) {
            health = h;
            return true;
        }
        else {
            System.err.println("ERROR: BAD HEALTH!");
            return false;
        }
    }

    public String getName() {
        return name;
    }
}
