package model.ship;

import model.navigation.CoordinateModel;

public class ShipModel {
    private String shipName;
    private boolean isSunken;
    private int shipSize;
    private CoordinateModel[] coordinates;

    public ShipModel(
            String shipName,
            boolean isSunken,
            int shipSize
            ) {
        this.shipName = shipName;
        this.isSunken = isSunken;
        this.shipSize = shipSize;
        this.coordinates = new CoordinateModel[shipSize];
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

    public CoordinateModel[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinat(int index, CoordinateModel coordinate) {
        coordinates[index] = coordinate;
    }
}
