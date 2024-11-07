package edu.schollj3.assign05;

import java.util.*;

public class Woods {
    ArrayList<Giant> giants = new ArrayList<>();

    public Giant createGiant(String name, String typeName) {
        if(name.isEmpty()) {
            return null;
        }else{
            switch (typeName) {
                case "GIANT" -> new Giant(name);
                case "TROLL" -> new Troll(name);
                case "TREE" -> new Tree(name);
                case "ENT" -> new Ent(name);
                case "HUORN" -> new Huorn(name);
                default -> null;

            }
        }
    }
}
