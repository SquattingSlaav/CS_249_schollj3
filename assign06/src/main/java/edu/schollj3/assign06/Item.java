package edu.schollj3.assign06;

import java.util.*;

public class Item implements Loadable {
    protected String ID;
    protected int value;

    public Item() {
        ID = "";
        value = 0;
    }

    public Item(String ID, int value) {
        this.ID = ID;
        this.value = value;
    }

    public String getID() {
        return ID;
    }

    public int getValue() {
        return value;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ID + " with value " + value);
        return sb.toString();
    }

    public void load(Scanner input) throws GameFileException {
        try {
            ID = input.next();
            value = input.nextInt();
        }catch (Exception e) {
            ID = "";
            value = 0;
            throw new GameFileException("Error loading Item",  e);
        }
    }
}
