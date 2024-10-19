package view;

import model.State;

/*
 * Visual user interface
 * is responsible for presenting data to users or
 * handling user interaction
 * */

public class Radar {
    public void detect(State[][] quadrant) {

        // Add numbers 1-10 above game board for column enumeration
        for (int i = 0; i < quadrant.length; i++) {
            System.out.print((i == 0 ? "  " : " ") + (i + 1));
        }
        System.out.println();

        // Add characters A-J left of game board for row enumeration
        char ch = 'A';
        for (int i = 0; i < quadrant.length; i++) {
            System.out.print(ch + " ");
            ch++;
            for (int j = 0; j < quadrant[i].length; j++) {
                System.out.print(quadrant[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}