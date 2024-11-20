package edu.schollj3.assign06;

import edu.schollj3.assign04.GameBoard;

import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable {
ArrayList<Loadable> loadables = new ArrayList<>();
GameBoard baseMap = new GameBoard(12, 30, '.');

    public Loadable createLoadable(String typeName) throws GameFileException {
        return switch (typeName) {
            case "Skeleton" -> new Skeleton();
            case "Rat" -> new Rat();
            case "Item" -> new Item();
            case "Tome" -> new Tome();
            default -> throw new GameFileException("Unknown type: " + typeName);
        };
    }

    public void load(Scanner input) throws GameFileException {
        baseMap.clear();
        loadables.clear();

        String typeName;
        Loadable m;
        int lines = input.nextInt();
        for (int i = 0; i < lines; i++) {
            typeName = input.next();
            m = createLoadable(typeName);
            m.load(input);
            loadables.add(m);
            if (m instanceof Drawable) {
                ((Drawable) m).draw(baseMap);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(baseMap.getBoardString() + "\n");
        sb.append("CREATURES:\n");
        for (Loadable c : loadables) {
            if (c instanceof Creature) {
                sb.append("* " + c + "\n");
            }
        }
        sb.append("INVENTORY:\n");
        for (Loadable item : loadables) {
            if (item instanceof Item) {
                sb.append("* " + item + "\n");
            }
        }
        return sb.toString();
    }

    public void save(String filename) throws GameFileException {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.print(this.toString());
            writer.close();
        }catch (Exception e) {
            throw new GameFileException("Failed to save file!");
        }
    }
}
