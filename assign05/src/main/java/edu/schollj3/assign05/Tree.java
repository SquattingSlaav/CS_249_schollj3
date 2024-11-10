package edu.schollj3.assign05;

public class Tree extends Giant {
    public Tree(String name) {
        super(name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" of the trees");
        return sb.toString();
    }

    public String speak() {
        return "<rustling>";
    }
}
