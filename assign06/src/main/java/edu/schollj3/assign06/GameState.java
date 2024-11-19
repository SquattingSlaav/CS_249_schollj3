package edu.schollj3.assign06;

import java.util.*;

public class GameState implements Loadable {


    public Loadable createLoadable(String typeName) throws GameFileException {
        return switch (typeName) {
            case "Skeleton" -> new Skeleton();
            case "Rat" -> new Rat();
            case "Item" -> new Item();
            case "Tome" -> new Tome();
            default -> throw new GameFileException("Unknown type: " + typeName);
        }
    }

    public void load(Scanner input) throws GameFileException {

    }
}
