package model.ship;

import model.navigation.CoordinateModel;

import java.util.LinkedList;

public class ShipModel {
    private String shipName;
    private boolean isSunken;
    private int shipSize;
    private CoordinateModel[] shipCoords;

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

    public CoordinateModel[] getShipCoords() {
        return shipCoords;
    }

    public void placeShip(CoordinateModel[] shipCoords) {
        this.shipCoords = shipCoords;
    }

    public void setCoordinate(int index, CoordinateModel coordinate) {
        shipCoords[index] = coordinate;
    }
}
