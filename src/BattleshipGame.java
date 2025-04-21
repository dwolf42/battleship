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

        int[] allShipPartsCoords;
        int xCoord = parsedCoords[0];
        int yCoord = parsedCoords[1];

        /* The user only inputs the coordinates of the ship's front and tail,
         * which means the ship parts that lay between them must be calculated.
         * Each of these two points are represented by a pair of coordinates, X and Y.
         * Here are two examples:
         * a) 0 2 mark the front, 0 6 mark the tail (horizontal alignment)
         * b) 0 6 mark the front, 2 6 mark the tail (vertical alignment)
         * Putting these in an array, the representation would be [0, 2, 0, 6]
         *
         *
         */
        if (parsedCoords[0] == parsedCoords[2]) {
            /* As two index-parts of the parsed coordinates are always the same on a 2D array,
             * the ship's size can be calculated, which is used to determine the length of @param allShipPartsCoords
             */
            int arraySize = 2 * ((Math.abs(parsedCoords[1] - parsedCoords[3]) + 1));
            allShipPartsCoords = new int[arraySize];

            for (int i = 0; i < allShipPartsCoords.length; i++) {
                if (i % 2 == 0) {
                    allShipPartsCoords[i] = xCoord;
                } else {
                    allShipPartsCoords[i] = yCoord;
                    yCoord++;
                }
            }
            System.out.println("allShipPartsCoords: " + Arrays.toString(allShipPartsCoords));
        }

        if (parsedCoords[1] == parsedCoords[3]) {
            int arraySize = 2 * ((Math.abs(parsedCoords[0] - parsedCoords[2]) + 1));
            allShipPartsCoords = new int[arraySize];
            for (int i = 0; i < allShipPartsCoords.length; i++) {
                if (i % 2 == 0) {
                    allShipPartsCoords[i] = xCoord;
                    xCoord++;
                } else {
                    allShipPartsCoords[i] = yCoord;
                }
            }
            System.out.println("allShipPartsCoords: " + Arrays.toString(allShipPartsCoords));
        }
    }
}