package conroller;

import model.ConstantsModel;

import java.util.Scanner;

public class CoordinateController {

    // Coordinates are input by user as a string like 'D3 D6'. Tokenization allows easier validation and preperation
    // for parsing them to array indexes
    public static int[] askAndValidateCoords(String shipName, int shipSize) {
        String[] coords;
        // TODO: implement a loop for asking the user for coords, which displays 'Error' when invalid

        System.out.println(ConstantsModel.ASK_COORDINATES + shipName);
        System.out.println(ConstantsModel.TELL_SIZE + shipSize);
        coords = new Scanner(System.in).nextLine().toUpperCase().split(" ");

        while (!coords[0].matches(ConstantsModel.VALID_COORD_PATTERN)
                && !coords[1].matches(ConstantsModel.VALID_COORD_PATTERN)) {
            System.out.println(ConstantsModel.TELL_ERROR);
            System.out.println(ConstantsModel.ASK_COORDINATES + shipName);
            System.out.println(ConstantsModel.TELL_SIZE + shipSize);
            coords = new Scanner(System.in).nextLine().toUpperCase().split(" ");
        }

        return parseCoords(coords);
    }

    private static int[] parseCoords(String[] coords) {
        int[] parsedMove = new int[4];
        for (int i = 0; i < coords.length; i++) {
            // These two lines were made by ChatGPT
            parsedMove[i * 2] = coords[i].toUpperCase().charAt(0) - 65;
            parsedMove[i * 2 + 1] = Integer.parseInt(coords[i].substring(1)) - 1;
        }
        return parsedMove;
    }
}
