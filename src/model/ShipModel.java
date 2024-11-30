package model;

public class ShipModel {
    private String typ;
    private int health;
    private int x1, x2, y1, y2;
    boolean isSunken;

    public ShipModel(String type, int health, int x1, int x2, int y1, int y2, boolean isSunken) {
        this.typ = type;
        this.health = health;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.isSunken = isSunken;
    }
}
