package model;

import model.ship.CarrierModel;
import model.ship.BattleshipModel;
import model.ship.CruiserModel;
import model.ship.SubmarineModel;
import model.ship.DestroyerModel;
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
        ships.add(new CarrierModel());
        ships.add(new BattleshipModel());
        ships.add(new CruiserModel());
        ships.add(new SubmarineModel());
        ships.add(new DestroyerModel());
        for (int i = 0; i < ships.size(); i++) {
            askShipCoordinates(ships.get(i).getShipName(),
                    ships.get(i).getShipSize());
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

    // Coordinates are input by user as a string like 'D3 D6'. Tokenization allows easier validation and preperation
    // for parsing them to array indexes
    private int askAndValidCoords(String shipName, String shipSize) {
        Scanner scanner = new Scanner(System.in);
        String[] coords;
        // TODO: implement a loop for asking the user for coords, which displays 'Error' when invalid
        do {
            System.out.println(ConstantsModel.ASK_COORDINATES + shipName);
            System.out.println(ConstantsModel.TELL_SIZE + shipSize);
            coords = scanner.nextLine().toUpperCase().split(" ");
        } while (!coords[0].matches(ConstantsModel.VALID_COORD_PATTERN)
                && !coords[1].matches(ConstantsModel.VALID_COORD_PATTERN));
        int[] indexes = parseCoords(coords);
    }

    private int[] parseCoords(String[] coords) {
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
