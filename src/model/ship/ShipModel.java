package model.ship;

public class ShipModel {
    private String shipName;
    private boolean isSunken;
    private int shipSize;
    private final int shipFront1;
    private final int shipFront2;
    private final int shipBack1;
    private final int shipBack2;

    public ShipModel(
            String shipName,
            int shipSize,
            boolean isSunken) {
        this.shipName = shipName;
        this.isSunken = isSunken;
        this.shipSize = shipSize;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getShipSize() {
        return shipSize;
    }

    public void setShipSize(int shipSize) {
        this.shipSize = shipSize;
    }

    public boolean isSunken() {
        return isSunken;
    }

    public void setSunken(boolean sunken) {
        isSunken = sunken;
    }
}
