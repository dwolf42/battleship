package model.ship;

public class ShipModel {
    private String shipName;
    private boolean isSunken;
    private int shipSize;
    private int shipFront1;
    private int shipFront2;
    private int shipBack1;
    private int shipBack2;

    public ShipModel(
            String shipName,
            boolean isSunken,
            int shipSize
            ) {
        this.shipName = shipName;
        this.isSunken = isSunken;
        this.shipSize = shipSize;
    }

    public void shoot() {
        System.out.println("Pew Pew");
    }

    public String getShipName() {
        return shipName;
    }

    public int getShipSize() {
        return shipSize;
    }

    public boolean isSunken() {
        return isSunken;
    }

    public void setSunken(boolean sunken) {
        isSunken = sunken;
    }

    public int getShipFront1() {
        return shipFront1;
    }

    public void setShipFront1(int shipFront1) {
        this.shipFront1 = shipFront1;
    }

    public int getShipFront2() {
        return shipFront2;
    }

    public void setShipFront2(int shipFront2) {
        this.shipFront2 = shipFront2;
    }

    public int getShipBack1() {
        return shipBack1;
    }

    public void setShipBack1(int shipBack1) {
        this.shipBack1 = shipBack1;
    }

    public int getShipBack2() {
        return shipBack2;
    }

    public void setShipBack2(int shipBack2) {
        this.shipBack2 = shipBack2;
    }
}
