package conroller;

import model.Ocean;
import view.Radar;

public class Navigation {
    private Ocean ocean;
    private Radar radar;
    private boolean gameover = false;

    final int MAP_ROWS = 10;
    final int MAP_COLS = 10;
    final char CELL_STATE = '~';

    public Navigation() {
        ocean = new Ocean(MAP_ROWS, MAP_COLS, CELL_STATE);
        radar = new Radar();
        radar.showMap(ocean.getMap());

    }

    public void run() {

        while (!gameover) {


        }
    }

    private void placeShips() {
        // TODO:
        //  There is a method required to take/process ship-objects to avoid boilerplate like that:
        ocean.updateCell(3, 3, 'O');
        ocean.updateCell(3, 4, 'O');
        ocean.updateCell(3, 5, 'O');
        radar.showMap(ocean.getMap());
    }

    public static int[] convertCoordiante(String input) {
        // in ASCII or Unicode 'a' is represented by 97, so a - a = 0, and b - a = 1 etc.
        int row = input.toLowerCase().charAt(0) - 'a';
        int col = Integer.parseInt(input.substring(1)) - 1;

        return new int[]{row, col};
    }
}

