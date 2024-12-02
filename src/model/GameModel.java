package model;

import assets.Ship;

import java.util.ArrayList;
import java.util.Arrays;

public class GameModel {
    final private String[] SHIP_TYPES = {"Carrier", "Battleship", "Cruiser", "Submarine", "Destroyer"};
    final private int[] SHIP_SIZES = {5, 4, 3, 3, 2, 1};
    private ArrayList<Ship> usrShips;
    private ArrayList<Ship> cpuShips;
    private char[][] gameMap;

    public GameModel() {
        this.gameMap = new char[10][10];
        for (char[] parts : gameMap) {
            Arrays.fill(parts, '~');
        }
    }

    public char[][] getMap() {
        return gameMap;
    }

    public void generateMap(int row, int col, char state) {
        this.gameMap[row][col] = state;
    }

    public void initShips() {
        usrShips = new ArrayList<>();
        for (int i = 0; i < SHIP_TYPES.length; i++) {
            usrShips.add(new Ship(
                    SHIP_TYPES[i],
                    false,
                    SHIP_SIZES[i],
                    0,
                    0,
                    0,
                    0));
        }
        // TODO: init cpuShips
    }


    /*     y 1    2    3
     * x A [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *   B [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *
     *
     *
     *
     * */


}
