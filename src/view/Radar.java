package view;

/*
 * Visual user interface
 * is responsible for presenting data to users or
 * handling user interaction
 * */

public class Radar {
    public void showMap(char[][] map) {

        // Add numbers 1-10 above game board for column enumeration
        for (int i = 0; i < map.length; i++) {
            System.out.print((i == 0 ? "  " : " ") + (i + 1));
        }
        System.out.println();

        // Add characters A-J left of game board for row enumeration
        // Using numbers as incrementor instead of characters to utilize the array's length as limit
        char ch = 'A';
        for (int i = 0; i < map.length; i++) {
            System.out.print(ch + " ");
            ch++;
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}