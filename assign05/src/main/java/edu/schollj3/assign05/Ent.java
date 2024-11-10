package edu.schollj3.assign05;

public class Ent extends Tree{
    public Ent(String name) {
        super(name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ent ");
        sb.append(super.toString());
        return sb.toString();
    }

    public String speak() {
        return "HOOM";
    }
}
