package conroller;

import model.ConstantsModel;
import model.ship.ShipModel;
import model.navigation.CoordinateModel;

import java.util.Scanner;

public class CoordinateController {
    private static ShipModel ship;

    public static ShipModel placeShip(ShipModel ship) {
        CoordinateController.ship = ship;

        int[] fullShipCoords = askShipCoords();
        CoordinateModel[] shipCoordinates = new CoordinateModel[fullShipCoords.length];
        for (int i = 0; i < shipCoordinates.length - 1; i++) {
            shipCoordinates[i] = new CoordinateModel(i, i + 1);
        }
        ship.putShip(shipCoordinates);



        return ship;
    }

    private static int[] askShipCoords() {
        askCoords(ship.getName(), ship.getSize());
        String[] userInputCoords = new Scanner(System.in).nextLine().toUpperCase().split(" ");

        while (!userInputCoords[0].matches(ConstantsModel.COORDS_REGEX)
                && !userInputCoords[1].matches(ConstantsModel.COORDS_REGEX)) {
            System.out.println(ConstantsModel.TELL_ERROR);
            askCoords(ship.getName(), ship.getSize());
            userInputCoords = new Scanner(System.in).nextLine().toUpperCase().split(" ");
        }

        return parseCoordsToArrayIndexes(userInputCoords);
    }

    // Coordinates are input by user as a string like 'D3 D6'. Tokenization allows easier validation and preparation
    // for parsing them to array indexes
    private static void askCoords(String shipName, int shipSize) {
        System.out.println(ConstantsModel.ASK_BOARD_COORDS + shipName);
        System.out.println(ConstantsModel.TELL_SIZE + shipSize);
    }

    /**
     * To represent the alphanumeric coords in an array-index format, they require parsing
     *
     * @param userInputCoords
     * @return array-index parsed alphanumeric coords
     */
    private static int[] parseCoordsToArrayIndexes(String[] userInputCoords) {
        int[] parsedCoords = new int[4];
        for (int i = 0; i < userInputCoords.length; i++) {
            // These two lines were made by ChatGPT
            parsedCoords[i * 2] = userInputCoords[i].toUpperCase().charAt(0) - 65;
            parsedCoords[i * 2 + 1] = Integer.parseInt(userInputCoords[i].substring(1)) - 1;
        }
        return extrapolateBodyCoords(parsedCoords);
    }

    /**
     * User input consists only of the coordinates of a ships front and tail, the ship's body part's locations
     * have to be extrapolated from these.
     *
     * @param parsedCoords index 0 and 1 represent the ships front, index 2 and 3 the tail.
     * @return an array containing the parsedCoords and the extrapolated coords.
     */
    private static int[] extrapolateBodyCoords(int[] parsedCoords) {
        int[] allShipPartsCoords = new int[ship.getSize() * 2];

        int xCoord = parsedCoords[0];
        int yCoord = parsedCoords[1];

        /* In case the even indexes of parsedCoords are equal, this value of the equal indexes remains unchanged
         * for all coordinates and only the odd indexes are extrapolated.
         * In this case, the 3rd index determines the upper limit for the extrapolation.
         */
        if (parsedCoords[0] == parsedCoords[2]) {
            for (int i = 0; i < parsedCoords[3]; i++) {
                if (i % 2 == 0) {
                    allShipPartsCoords[i] = xCoord;
                } else {
                    allShipPartsCoords[i] = yCoord;
                    yCoord++;
                }
            }
        }

        /* In case the odd indexes of parsedCoords are equal, this value of the odd indexes remains unchanged
         * for all coordinates and only the even indexes are extrapolated.
         * In this case, the 2nd index determines the upper limit for the extrapolation.
         */
        if (parsedCoords[1] == parsedCoords[3]) {
            for (int i = 0; i < parsedCoords[2]; i++) {
                if (i % 2 == 0) {
                    allShipPartsCoords[i] = xCoord;
                    xCoord++;
                }
                allShipPartsCoords[i] = yCoord;
            }
        }
        return allShipPartsCoords;
    }
}
