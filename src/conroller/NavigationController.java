package conroller;

import model.OceanModel;
import model.ShipModel;
import view.RadarView;

public class NavigationController {
    private OceanModel oceanModel;
    private RadarView radarView;
    private ShipModel shipModel;
    private boolean gameover = false;

    final private int MAP_ROWS = 10;
    final private int MAP_COLS = 10;
    final private char CELL_STATE = '~';
    final private String[] SHIP_TYPES = {"Battle Cruiser"};



    public NavigationController() {
        oceanModel = new OceanModel(MAP_ROWS, MAP_COLS, CELL_STATE);
        radarView = new RadarView();
        radarView.showMap(oceanModel.getMap());

    }

    public void run() {

        while (!gameover) {


        }
    }

    private void placeShips() {
        // TODO:
        //  There is a method required to take/process ship-objects to avoid boilerplate like that:
        oceanModel.updateCell(3, 3, 'O');
        oceanModel.updateCell(3, 4, 'O');
        oceanModel.updateCell(3, 5, 'O');
        radarView.showMap(oceanModel.getMap());
    }

    public static int[] convertCoordiante(String input) {
        // in ASCII or Unicode 'a' is represented by 97, so a - a = 0, and b - a = 1 etc.
        int row = input.toLowerCase().charAt(0) - 'a';
        int col = Integer.parseInt(input.substring(1)) - 1;

        return new int[]{row, col};
    }
}

