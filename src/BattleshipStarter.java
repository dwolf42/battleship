import conroller.GameController;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Basically, and ocean consists of quadrants, like 1x1 meters.
 * Each quadrant can have a state, like being water, a ship, a hit ship, or a miss.
 * In order to know where each quadrant is located on the ocean, it has individual coordinates, like 1,3, 2,5 etc.
 * The state is the lowest level of the hierarchy, but contains the most valuable variable.
 * The quadrant is the next higher level in the hierarchy,
 *
 * */

public class BattleshipStarter {
    public static void main(String[] args) {
       /*
       // Convert user guess to board indices
          function parseGuess(guess) {
          const row = guess[0].toUpperCase().charCodeAt(0) - 65;  // Convert letter to row index
          const col = parseInt(guess[1]) - 1;  // Convert number to column index
          return [row, col];
}
        */
        Scanner scanner = new Scanner(System.in);
        String[] coordinatesInput = scanner.nextLine().split(" ");
        int[] move = parseMove(coordinatesInput);
        System.out.println(Arrays.toString(move));
    }

    // FIXME: index out of bounds: parameter array has only 2 indexes, target int array has 4
    private static int[] parseMove(String[] coordinatesInput) {
        int[] parsedMove = new int[4];
        for (int i = 0; i < coordinatesInput.length; i++) {
            // These two lines were made by ChatGPT
            parsedMove[i * 2] = coordinatesInput[i].toUpperCase().charAt(0) - 65;
            parsedMove[i * 2 + 1] = Integer.parseInt(coordinatesInput[i].substring(1)) - 1;
        }
        return parsedMove;
}

private static void init() {
    GameController gameController = new GameController();
    gameController.run();
}
}