package conroller;

import model.Ocean;
import model.State;
import view.Radar;

public class Navigation {
    private Ocean ocean;
    private Radar radar;
    private boolean gameover = false;

    public Navigation() {
        int row = 10;
        int col = 10;
        State coordinateState = State.WATER;

        ocean = new Ocean(row, col, coordinateState);
        radar = new Radar();
        radar.detect(ocean.getQuadrant());
        placeShips();
        run();
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
}
