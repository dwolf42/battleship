package conroller;

import model.ConstantsModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoordinateController {

    // Coordinates are input by user as a string like 'D3 D6'. Tokenization allows easier validation and preperation
    // for parsing them to array indexes
    public static int[] askCoords(String shipName, int shipSize) {
        String[] coords;
        System.out.println(ConstantsModel.ASK_BOARD_COORDS + shipName);
        System.out.println(ConstantsModel.TELL_SIZE + shipSize);
        coords = new Scanner(System.in).nextLine().toUpperCase().split(" ");

        while (!coords[0].matches(ConstantsModel.COORDS_REGEX)
                && !coords[1].matches(ConstantsModel.COORDS_REGEX)) {
            System.out.println(ConstantsModel.TELL_ERROR);
            System.out.println(ConstantsModel.ASK_BOARD_COORDS + shipName);
            System.out.println(ConstantsModel.TELL_SIZE + shipSize);
            coords = new Scanner(System.in).nextLine().toUpperCase().split(" ");
        }
        return extrapolateBodyCoords(parseCoords(coords), shipSize);
    }

    // Parse coords from alphanumeric to array-index format, so they can be represented in an array
    private static int[] parseCoords(String[] coords) {
        int[] parsedCoords = new int[4];
        for (int i = 0; i < coords.length; i++) {
            // These two lines were made by ChatGPT
            parsedCoords[i * 2] = coords[i].toUpperCase().charAt(0) - 65;
            parsedCoords[i * 2 + 1] = Integer.parseInt(coords[i].substring(1)) - 1;
        }
        return parsedCoords;
    }

    // User input consists only of start/end coords of a ship, from which the coords of the ship parts in between must
    // be extrapolated
   private static int[] extrapolateBodyCoords(int[] parsedCoords, int shipSize) {
       // F3 G3 H3
       // 52 62 72
       // 1,0 2,0
       int[] fullShipCoords = new int[shipSize * 2];
       // F3 H3 (vertical)
       if (parsedCoords[0] != parsedCoords[3]) {
          fullShipCoords[0] = parsedCoords[0];
          fullShipCoords[1] = parsedCoords[3];
       }
       List<Integer> filledCoordGaps = new ArrayList();
       for (int i = 0; i < parsedCoords[2]; i++) {
          filledCoordGaps.add(parsedCoords);
       }
   }
}
