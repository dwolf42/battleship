package model;

public class ShipModel {
    private String typ;
    private int health;
    private int length;
    private int x1, x2, y1, y2;
    private boolean isSunken;

    public ShipModel(String type,
                     int health,
                     int length,
                     int x1,
                     int x2,
                     int y1,
                     int y2,
                     boolean isSunken) {
        this.typ = type;
        this.health = health;
        this.length = length;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.isSunken = isSunken;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public boolean isSunken() {
        return isSunken;
    }

    public void setSunken(boolean sunken) {
        isSunken = sunken;
    }
}
