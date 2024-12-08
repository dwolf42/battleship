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

    public void getValidMove() {
        System.out.println(ConstantsModel.ASK_FIRST_COORDINATE);
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;
        char[] firstCoordinate;

        while(!isValidInput) {
        String input = scanner.nextLine().trim().toUpperCase();

        if(
                !(input.charAt(0) > 'J')
        || !(input.charAt(1) > 10)) {
            return
        }
        }

        if(firstCoordinate[0] > 'J'
                || firstCoordinate[1] > 10) {
            System.out.println(ConstantsModel.INVALID_COORDINATE);
        }

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
            System.out.println(ConstantsModel.ASK_FIRST_COORDINATE);
            coordinates[i] = new Scanner(System.in).nextInt();
        }
        return coordinates;
}


/*     y 1    2    3    4
 * x A [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *   B [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *   C [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *
 *
 * A2
 *    A4
 *    C2
 *   ~B4
 *   ~C4
 *
 *
 *
 * A2 B3
 *
 * */


}
