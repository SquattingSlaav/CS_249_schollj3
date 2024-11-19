package edu.schollj3.assign06;

public class Skeleton extends Creature {
    public Skeleton() {}

    public Skeleton(int row, int col) { super(row, col); }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Skeleton at " + getRow() + "," + getCol());
        return sb.toString();
    }
}
