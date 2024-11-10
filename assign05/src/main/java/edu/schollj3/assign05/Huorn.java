package edu.schollj3.assign05;

public class Huorn extends Tree{
    public Huorn(String name) {
        super(name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Huorn ");
        sb.append(super.toString());
        return sb.toString();
    }

    public String speak() {
        return "<angry rustling>";
    }
}
