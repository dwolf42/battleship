package model;

import assets.Ship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

    public void makeMove() {
        System.out.println(ConstModel.ASK_COORDINATE.getStr());
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

    private int[] getCoordinates() {
        int[] coordinates = new int[4];
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println(ConstantsModel.ASK_COORDINATE);
            coordinates[i] = new Scanner(System.in).nextInt();
        }
        return coordinates;
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
