package conroller;

import model.ConstantsModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoordinateController {

    // Coordinates are input by user as a string like 'D3 D6'. Tokenization allows easier validation and preperation
    // for parsing them to array indexes
    public static int[] askValidateBoardCoords(String shipName, int shipSize) {
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
        return fillCoordGaps(parseCoords(coords), shipSize);
    }

    private static int[] parseCoords(String[] coords) {
        int[] parsedCoords = new int[4];
        for (int i = 0; i < coords.length; i++) {
            // These two lines were made by ChatGPT
            parsedCoords[i * 2] = coords[i].toUpperCase().charAt(0) - 65;
            parsedCoords[i * 2 + 1] = Integer.parseInt(coords[i].substring(1)) - 1;
        }
        return parsedCoords;
    }
   private static int[] fillCoordGaps(int[] parsedCoords, int shipSize) {
       List<Integer> filledCoordGaps = new ArrayList();
       for (int i = 0; i < shipSize * 2; i++) {
           filledCoordGaps.addFirst();
            filledCoordGaps.add(parsedCoords[i];
       }
   }
}
