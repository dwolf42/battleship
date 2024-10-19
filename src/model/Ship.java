package model;

public class Ship {
    private String name;
    private int health;
    private int x1, x2, y1, y2;
    boolean isSunken;

    public Ship(String name, int health, int x1, int x2, int y1, int y2, boolean isSunken) {
        this.name = name;
        this.health = health;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.isSunken = isSunken;
    }
}
