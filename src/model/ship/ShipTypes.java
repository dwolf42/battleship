package model.ship;

public enum ShipTypes {

   // CARRIER(5),
   // BATTLESHIP(4),
   // CUISER(3),
   // SUBMARINE(3),
   // DESTROYER(2);
    CARRIER("Carrier"),
    BATTLESHIP("Battleship"),
    CRUISER("Cruiser"),
    SUBMARINE("Submarine"),
    DESTROYER("Destroyer");

    private final String name;

    ShipTypes(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
