package model.ship;

public enum ShipTypes {
    CARRIER("Carrier", 5),
    BATTLESHIP("Battleship", 4),
    CRUISER("Cruiser", 3),
    SUBMARINE("Submarine", 3),
    DESTROYER("Destroyer", 2);

    private final String label;
    private final int shipSize;

    ShipTypes(final String label, final int shipSize) {
        this.label = label;
        this.shipSize = shipSize;
    }

    public String getLabel() {
        return this.label;
    }

    public int getShipSize() {
        return this.shipSize;
    }

}
