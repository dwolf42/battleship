import conroller.Navigation;

/*
Basically, and ocean consists of quadrants, like 1x1 meters.
* Each quadrant can have a state, like being water, a ship, a hit ship, or a miss.
* In order to know where each quadrant is located on the ocean, it has individual coordinates, like 1,3, 2,5 etc.
* The state is the lowest level of the hierarchy, but contains the most valuable variable.
* The quadrant is the next higher level in the hierarchy,
*
* */

public class Main {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int y1 = 4;
        int y2 = 2;
        int xdiff = Math.abs(x1 - x2); // 0
        int ydiff = Math.abs(y1 - y2); // 2

        System.out.println(!(xdiff == 0 ^ ydiff == 0));

        Navigation navigation = new Navigation();
        navigation.run();
    }

}