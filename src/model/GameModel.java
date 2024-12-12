package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GameModel {

    private ArrayList<ShipModel> usrShipModels;
    private ArrayList<ShipModel> cpuShipModels;
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

    public void placeShips() {
        System.out.println(ConstantsModel.ASK_COORDINATE_START);
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
