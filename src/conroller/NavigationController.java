package conroller;

import model.OceanModel;
import model.ShipModel;
import view.RadarView;

import java.util.ArrayList;

public class NavigationController {
    private OceanModel oceanModel;
    private RadarView radarView;
    private ArrayList<ShipModel> usrShips;
    private ArrayList<ShipModel> cpuShips;
    private boolean gameover = false;

    final private int MAP_ROWS = 10;
    final private int MAP_COLS = 10;
    final private char CELL_STATE = '~';
    final private String[] SHIP_TYPES = {"Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"};
    final private int[] SHIP_LENGTH = {5, 4, 3, 3, 2};

    public NavigationController() {
        oceanModel = new OceanModel(MAP_ROWS, MAP_COLS, CELL_STATE);
        radarView = new RadarView();
        usrShips = new ArrayList<>();
        cpuShips = new ArrayList<>();
        radarView.showMap(oceanModel.getOcean());

    }

    public void run() {

        while (!gameover) {


        }
    }

    private void initialShipPlacement() {
        for(int i = 0; i < SHIP_TYPES.length; i++) {
            usrShips.add(new ShipModel(SHIP_TYPES[i],
                    SHIP_LENGTH[i],
                    SHIP_LENGTH[i],

                    ))
        }
    }

    public static int[] convertCoordiante(String input) {
        // in ASCII or Unicode 'a' is represented by 97, so a - a = 0, and b - a = 1 etc.
        int row = input.toLowerCase().charAt(0) - 'a';
        int col = Integer.parseInt(input.substring(1)) - 1;

        return new int[]{row, col};
    }
}

