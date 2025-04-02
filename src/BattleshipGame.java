import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class BattleshipGame {
    private Map<String, Integer> ships;
    private char[][] gameMap;

    public BattleshipGame() {
        ships = new LinkedHashMap<>();
        ships.put("Carrier", 5);
        ships.put("Battleship", 4);
        ships.put("Cruiser", 3);
        ships.put("Submarine", 3);
        ships.put("Destroyer", 2);

        ships.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();

        gameMap = new char[10][10];
        for (char[] location : gameMap) {
            Arrays.fill(location, '~')
        }
    }
}