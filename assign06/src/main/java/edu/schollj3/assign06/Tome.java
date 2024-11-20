package edu.schollj3.assign06;

import java.util.*;

public class Tome extends Item {
    protected String skill;

    public Tome() {
        skill = "";
    }

    public Tome(String ID, int value, String skill) {
        super(ID, value);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void read() {
        System.out.println("Skill " + skill + " increased!");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString() + ", enhances " + skill);
        return sb.toString();
    }

    public void load(Scanner input) throws GameFileException {
        try {
            super.load(input);
            skill = input.next();
        }catch(Exception e){
            ID = "";
            value = 0;
            skill = "";
            throw new GameFileException("Error loading Tome");
        }
    }
}
