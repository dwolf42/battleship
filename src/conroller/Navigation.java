package conroller;

import model.Ocean;
import model.State;
import view.Radar;

public class Navigation {
    private Ocean ocean;
    private Radar radar;
    private boolean gameover = false;

    public Navigation() {
        final int oceanRows = 10;
        final int oceanCols = 10;
        State coordinateState = State.WATER;

        ocean = new Ocean(oceanRows, oceanCols, coordinateState);
        radar = new Radar();
        radar.detect(ocean.getQuadrant());

    }

    public void run() {

        while (!gameover) {


        }
    }

    private void placeShips() {
        // TODO:
        //  There is a method required to take/process ship-objects to avoid boilerplate like that:
        ocean.setQuadrant(3, 3, State.SHIP);
        ocean.setQuadrant(3, 4, State.SHIP);
        ocean.setQuadrant(3, 5, State.SHIP);
        radar.detect(ocean.getQuadrant());
    }

    public static int[] convertCoordiante(String input) {
        // in ASCII or Unicode 'a' is represented by 97, so a - a = 0, and b - a = 1 etc.
        int row = input.toLowerCase().charAt(0) - 'a';
        int col = Integer.parseInt(input.substring(1)) - 1;

        return new int[]{row, col};
    }
}

