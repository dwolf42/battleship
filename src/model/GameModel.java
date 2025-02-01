package model;

import conroller.CoordinateController;
import model.navigation.CoordinateModel;
import model.ship.CarrierModel;
import model.ship.BattleshipModel;
import model.ship.CruiserModel;
import model.ship.SubmarineModel;
import model.ship.DestroyerModel;
import model.ship.ShipModel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class GameModel {
    Scanner scanner;
    private LinkedList<ShipModel> usrShipModels;
    private LinkedList<ShipModel> cpuShipModels;
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

        ShipModel Aydin = new ShipModel("Aydin", false, 5);
        Aydin.

        LinkedList<ShipModel> ships = new LinkedList<>();
        ships.add(CoordinateController.placeShip(new CarrierModel()));
        ships.add(CoordinateController.placeShip(new BattleshipModel()));
        ships.add(CoordinateController.placeShip(new CruiserModel()));
        ships.add(CoordinateController.placeShip(new SubmarineModel()));
        ships.add(CoordinateController.placeShip(new DestroyerModel()));

        // ships.add(

        return ships;
    }

    public void placeShips() {
        usrShipModels = initShips();
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
