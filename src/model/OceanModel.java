package model;

import java.util.Arrays;

public class OceanModel {
    private char[][] map;

    public OceanModel(int row, int col, char cellState) {
        this.map = new char[row][col];
       for (char[] parts : map) {
           Arrays.fill(parts, cellState);
       }
    }

    public char[][] getMap() {
        return map;
    }

    public void updateCell(int row, int col, char state) {
        this.map[row][col] = state;
    }



    /*
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
     *
     *
     *
     *
     * */


}
