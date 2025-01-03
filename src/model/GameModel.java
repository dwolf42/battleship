package model;

import conroller.CoordinateController;
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
        LinkedList<ShipModel> ships = new LinkedList<>();
        ships.add(new CarrierModel());
        ships.add(new BattleshipModel());
        ships.add(new CruiserModel());
        ships.add(new SubmarineModel());
        ships.add(new DestroyerModel());

        /**
         * zuerst fragt man die Anfangs und Endkoordinaten ab
         * die Koordinaten zwischen Anfang und Ende müssen generiert werden, anhand der
         * Größe des Schiffs. Diese werden dann zu CoordinateModels umgewandelt,
         * welche im Schiff gespeichert werden.
         */
        int[] validStartAndEndArrayCoords;
        for (int i = 0; i < ships.size(); i++) {
           validStartAndEndArrayCoords = CoordinateController.askCoords(ships.get(i).getShipName(),
                    ships.get(i).getShipSize());
           ships.get(i).
           // TODO: implement logic which sets the coordinates between start and end coordinate or better
           //       said which fills the coordinates between A and B with the correct coordinates
        }
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
