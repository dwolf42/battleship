package model;

import java.util.LinkedList;
import java.util.List;

public class ConstantsModel {
    public static final String ENTER_ALL_COORDINATES = "Enter the coordinates of the ship:";
    public static final String ASK_COORDINATE_START = "Please enter starting coordinate for your  ";
    public static final String ASK_COORDINATE_END = "Please enter end coordinate for your ";
    public static final LinkedList<String> SHIP_NAMES = new LinkedList<>(
            List.of("Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"));
    public static final LinkedList<Integer> SHIP_SIZES = new LinkedList<>(
            List.of(5, 4, 3, 3, 2, 1));
}
