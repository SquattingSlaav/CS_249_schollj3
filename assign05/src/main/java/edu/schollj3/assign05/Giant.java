package edu.schollj3.assign05;

public class Giant {
    protected String name;

    public Giant(String name) {
        setName(name);
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
