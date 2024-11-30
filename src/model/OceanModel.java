package model;

import java.util.Arrays;

public class OceanModel {
    private char[][] ocean;

    public OceanModel(int row, int col, char cellState) {
        this.ocean = new char[row][col];
       for (char[] parts : ocean) {
           Arrays.fill(parts, cellState);
       }
    }

    public char[][] getOcean() {
        return ocean;
    }

    public void updateCell(int row, int col, char state) {
        this.ocean[row][col] = state;
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
