package edu.schollj3.assign02;

public class SpaceVessel {
    private String vesselName = "";
    private int length = 0;
    private int weight = 0;

    public String getName() {
        return vesselName;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        vesselName = name;
    }

    public void setLength(int feet) {
        length = feet;
    }

    public void setWeight(int pounds) {
        weight = pounds;
    }

    public String getLengthString() {
        double meters = 0.3048*length;
        String s = "";
        s += length;
        s += " ft. (";
        s += String.format("%.2f", meters);
        s += " m)";
        return s;
    }

    public String getWeightString() {
        double kilograms = 0.4536*weight;
        String s = "";
        s += weight;
        s += " lbs. (";
        s += String.format("%.2f", kilograms);
        s += " kg)";
        return s;
    }

    public String toString() {
        String s = "";
        s += "NAME: " + vesselName + "\n";
        s += "LENGTH: " + getLengthString() + "\n";
        s += "WEIGHT: " + getWeightString() + "\n";
        return s;
    }
}
