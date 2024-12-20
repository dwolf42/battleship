package model;

import model.ship.ShipModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class GameModel {

    Scanner scanner;
    private ArrayList<ShipModel> usrShipModels;
    private ArrayList<ShipModel> cpuShipModels;
    private char[][] gameMap;

    public GameModel() {
        this.gameMap = new char[10][10];
        for (char[] locations : gameMap) {
            Arrays.fill(locations, '~');
        }
    }

    public char[][] getMap() {
        return gameMap;
    }

    public void generateMap(int row, int col, char state) {
        this.gameMap[row][col] = state;
    }

    public LinkedList<ShipModel> initShips() {
        LinkedList<ShipModel> ships = new LinkedList<>();
        for (int i = 0; i < ConstantsModel.SHIP_NAMES.size(); i++) {
            askShipCoordinates(ConstantsModel.SHIP_NAMES.get(i),
                    ConstantsModel.SHIP_SIZES.get(i));
            ships.add(new ShipModel(
                    ConstantsModel.SHIP_NAMES.get(i),
                    ConstantsModel.SHIP_SIZES.get(i),
                    false
            ));
        }
        return ships;
    }

    public void placeShips() {
        System.out.println(ConstantsModel.ASK_COORDINATE_START);
        scanner = new Scanner(System.in);
        int[] move = parseMove(
                // TODO: FIX ME
        null);
        System.out.println(Arrays.toString(move));
    }

    private String[] askShipCoordinates(String shipName, Integer shipSize) {
        scanner = new Scanner(System.in);
        String shipCoordinateStart = "";
        do {
            System.out.println(ConstantsModel.ASK_COORDINATE_START + shipName);
            // TODO: condition shall take shipSize into account
        } while (!shipCoordinateStart.matches("[A-J](10|[1-9])"));

        do {
            System.out.println(ConstantsModel.ASK_COORDINATE_END + shipName);
            // TODO: condition shall take shipSize into account
        } while (!shipCoordinateStart.matches("[A-J](10|[1-9])"));
       // TODO: FIX ME
        return null;
    }

    private static int[] parseMove(String[] coordinatesInput) {
        int[] parsedMove = new int[4];
        for (int i = 0; i < coordinatesInput.length; i++) {
            // These two lines were made by ChatGPT
            parsedMove[i * 2] = coordinatesInput[i].toUpperCase().charAt(0) - 65;
            parsedMove[i * 2 + 1] = Integer.parseInt(coordinatesInput[i].substring(1)) - 1;
        }
        return parsedMove;
    }
}

/*     y 1    2    3
 * x A [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
 *   B [(~)][(~)][(~)][(~)][(~)][(~)][(O)][(~)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(O)][(X)][(~)][(~)]
 *     [(~)][(~)][(~)][(~)][(~)][(~)][(O)][(M)][(~)][(~)]
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
