package model.ship;

public enum ShipTypes {
    CARRIER("Carrier", 5),
    BATTLESHIP("Battleship", 4),
    CRUISER("Cruiser", 3),
    SUBMARINE("Submarine", 3),
    DESTROYER("Destroyer", 2);

    private final String label;
    private final int health;

    ShipTypes(final String label, final int health) {
        this.label = label;
        this.health = health;
    }

    public String getLabel() {
        return this.label;
    }

    public int getHealth() {
        return this.health;
    }

}
