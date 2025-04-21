import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BattleshipGame {
    private Map<String, Integer> ships;
    private char[][] gameMap;
    private Scanner scanner;

    public BattleshipGame() {
        ships = new LinkedHashMap<>();
        ships.put("Carrier", 5);
        ships.put("Battleship", 4);
        ships.put("Cruiser", 3);
        ships.put("Submarine", 3);
        ships.put("Destroyer", 2);

//        ships.forEach((k, v) -> System.out.println(k + ": " + v));
//        System.out.println();

        gameMap = new char[10][10];
        for (char[] location : gameMap) {
            Arrays.fill(location, '~');
        }
        scanner = new Scanner(System.in);
    }

    void start() {
        printMap();
        enterCoords();
    }

    private void printMap() {

        // Add numbers 1-10 above game board for column enumeration
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print((i == 0 ? "  " : " ") + (i + 1));
        }
        System.out.println();

        // Add characters A-J left of game board for row enumeration
        // Using numbers as incrementor instead of characters to utilize the array's length as limit
        char ch = 'A';
        for (int i = 0; i < gameMap.length; i++) {
            System.out.print(ch + " ");
            ch++;
            for (int j = 0; j < gameMap[i].length; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void enterCoords() {
        final String COORDS_REGEX = "[A-J](10|[1-9])";
        System.out.println("Enter the coordinates of the ship:");

        String userInput = scanner.nextLine();
        userInput = userInput.toUpperCase();
        String[] splitInput = userInput.split(" ");

        while (!splitInput[0].matches(COORDS_REGEX)
                && !splitInput[1].matches(COORDS_REGEX)) {
            System.out.println("Error!");
            System.out.println("Enter the coordinates of the ship:");
            userInput = scanner.nextLine();
            userInput = userInput.toUpperCase();
            splitInput = userInput.split(" ");
        }


        /* Parse alphanumeric coordinates to their respective array indexes for an effort less resembling on the game map
         */
        int[] parsedCoords = new int[4];
        for (int i = 0; i < splitInput.length; i++) {
            // These two lines were made by ChatGPT
            parsedCoords[i * 2] = splitInput[i].charAt(0) - 65;
            parsedCoords[i * 2 + 1] = Integer.parseInt(splitInput[i].substring(1)) - 1;
        }
// parsedCoords works as intended



        /* The user only enters the positions for the front and tail of the ship. The missing positions of the other ship parts
         * in between can be calculated using the available positions.
         * Each position is represented by two coordinates on a 2D array, so the total number of
         * coordinates required corresponds to ship length n * 2.
         *
         */
        int[] allShipPartsCoords;
        // Die Front wird durch die Koordinaten X1 und Y1 dargestell und der Schwanz durch X2 und Y2.
        // Bei einer horizontalen Ausrichtung des Schiffs verändern sich Y1 und Y2,
        // bei einer vertikalen Ausrichtung verändern sich X1 und X2.

        // Wenn Index 0 und 2 gleich sind, muss sich Index 1 verändern, um die fehlenden Koordinaten zu berechnen
        if (parsedCoords[0] == parsedCoords[2]) {
            int itMustBeChanged = parsedCoords[1]
            int arraySize = 2 * ((Math.abs(parsedCoords[1] - parsedCoords[3]) + 1));
            allShipPartsCoords = new int[arraySize];

            for (int i = 0; i < allShipPartsCoords.length; i++) {
                if (i % 2 == 0) {
                    allShipPartsCoords[i] = parsedCoords[0];
                } else {
                    allShipPartsCoords[i] = itMustBeChanged;
                    itMustBeChanged++;
                }
            }
            System.out.println(Arrays.toString(allShipPartsCoords));
        }

        // Wenn Index 1 und 3 gleich sind, muss sich Index 0 verändern, um die fehlenden Koordinaten zu berechnen
        if (parsedCoords[1] == parsedCoords[3]) {
            int itMustBeChanged = parsedCoords[0]
            int arraySize = 2 * ((Math.abs(parsedCoords[0] - parsedCoords[2]) + 1));
            allShipPartsCoords = new int[arraySize];
            for (int i = 0; i < allShipPartsCoords.length; i++) {
                if (i % 2 == 0) {
                    allShipPartsCoords[i] = itMustBeChanged;
                    itMustBeChanged++;
                } else {
                    allShipPartsCoords[i] = parsedCoords[1];
                }
            }
        }
    }
}