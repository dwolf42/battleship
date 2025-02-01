package model.ship;

import java.util.HashMap;
import java.util.Map;

public enum SHIP_TYPES {
    CARRIER("Carrier", 5),
    BATTLESHIP("Battleship", 4),
    CRUISER("Cruiser", 3),
    SUBMARINE("Submarine", 3),
    DESTROYER("Destroyer", 2);

    private static final Map<String, SHIP_TYPES> BY_LABEL = new HashMap<>();
    private static final Map<Integer, SHIP_TYPES> BY_HEALTH = new HashMap<>();


    static {
        for (SHIP_TYPES shipType : values()) {
            BY_LABEL.put(shipType.label, shipType);
            BY_HEALTH.put(shipType.health, shipType);
        }
    }

    private final String label;
    private final int health;

    SHIP_TYPES(final String label) {
        this.label = label;
    }

    public static SHIP_TYPES valueOfLabel(String label) {
        for (SHIP_TYPES type : values()) {
            if (type.label.equals(label)) {
                return type;
            }

        }
        return null;
    }

    public String getLabel() {
        return this.label;
    }

}
