import conroller.Navigation;

import java.util.Arrays;

/*
 * Basically, and ocean consists of quadrants, like 1x1 meters.
 * Each quadrant can have a state, like being water, a ship, a hit ship, or a miss.
 * In order to know where each quadrant is located on the ocean, it has individual coordinates, like 1,3, 2,5 etc.
 * The state is the lowest level of the hierarchy, but contains the most valuable variable.
 * The quadrant is the next higher level in the hierarchy,
 *
 * */

public class Main {
    public static void main(String[] args) {


        Navigation navigation = new Navigation();
        navigation.run();
    }
}