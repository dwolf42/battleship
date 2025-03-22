package model;

import controller.CoordinateController;
import model.ship.ShipModel;
import model.ship.ShipTypes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class BattleshipGame {
    private Scanner scanner;
    private char[][] gameMap;

    public BattleshipGame() {
        this.gameMap = new char[10][10];
        for (char[] index : gameMap) {
            Arrays.fill(index, '~');
        }
    }

    public char[] showMap() {
        for (char[] index : gameMap) {
            System.out.println(index);
        }
    }








}
