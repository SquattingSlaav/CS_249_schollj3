package edu.schollj3.assign06;

import edu.schollj3.assign04.GameBoard;

public class Rat extends Creature {
    public Rat() {}

    public Rat(int row, int col) { super(row, col); }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rat at " + getRow() + "," + getCol());
        return sb.toString();
    }

    public void draw(GameBoard map) {
        map.setPos(row, col, 'R');
    }
}
