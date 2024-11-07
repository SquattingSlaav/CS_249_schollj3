package edu.schollj3.assign05;

public class Troll extends Giant {
    public Troll(String name) {
        super(name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troll ");
        sb.append(super.toString());
        return sb.toString();
    }

    public String cook() {
        return "Mutton again...";
    }
}
