package model;

import java.util.Arrays;

public class Ocean {
    private State[][] quadrant;

    public Ocean(int row, int col, State state) {
        this.quadrant = new State[row][col];
        for (State[] states : quadrant) {
            Arrays.fill(states, state);
        }
    }

    public State[][] getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(int row, int col, State state) {
        this.quadrant[row][col] = state;
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
