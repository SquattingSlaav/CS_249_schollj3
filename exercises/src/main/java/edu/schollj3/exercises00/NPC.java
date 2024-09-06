package edu.schollj3.exercises00;

import edu.schollj3.items.*;

public class NPC {

    private int health = 100;
    private String name = "";

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        if (h>=0 && h<=100)
            health = h;
        else
            System.err.println("ERROR: BAD HEALTH!");
    }
}
