package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShipModel {
    private String shipName;
    private boolean isSunken;
    private int shipSize;
    private String shipCoordinateStart;
    private String shipCoordinateEnd;
    final private LinkedList<String> SHIP_NAMES = new LinkedList<>(
            List.of("Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"));
    final private LinkedList<Integer> SHIP_SIZES = new LinkedList<>(
            List.of(5, 4, 3, 3, 2, 1));

    public ShipModel(
            String shipName,
            int shipSize,
            boolean isSunken,
            String shipCoordinateStart,
            String shipCoordinateEnd) {
        this.shipName = shipName;
        this.isSunken = isSunken;
        this.shipSize = shipSize;
        this.shipCoordinateStart = shipCoordinateStart;
        this.shipCoordinateEnd = shipCoordinateEnd;
    }

    public LinkedList<ShipModel> initShips() {
        LinkedList<ShipModel> ships = new LinkedList<>();
        for (int i = 0; i < SHIP_NAMES.size(); i++) {
            askShipCoordinates(SHIP_NAMES.get(i));
            ships.add(new ShipModel(
                    SHIP_NAMES.get(i),
                    SHIP_SIZES.get(i),
                    false,
                    shipCoordinateStart,
                    shipCoordinateEnd));
        }
        return ships;
    }

    private void askShipCoordinates(String shipName) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(ConstantsModel.ASK_COORDINATE_START + shipName);
            shipCoordinateStart = scanner.nextLine();
            // TODO: condition shall take shipSize into account
        } while (!shipCoordinateStart.matches("[A-J](10|[1-9])"));

        do {
            System.out.println(ConstantsModel.ASK_COORDINATE_END + shipName);
            shipCoordinateEnd = scanner.nextLine();
            // TODO: condition shall take shipSize into account
        } while (!shipCoordinateStart.matches("[A-J](10|[1-9])"));
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

    public String getShipCoordinateStart() {
        return shipCoordinateStart;
    }


    public String getShipCoordinateEnd() {
        return shipCoordinateEnd;
    }

    public boolean isSunken() {
        return isSunken;
    }

    public void setSunken(boolean sunken) {
        isSunken = sunken;
    }
}
