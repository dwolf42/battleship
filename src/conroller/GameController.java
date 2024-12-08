package conroller;

import model.GameModel;
import view.GameView;

public class GameController {
    private GameModel gameModel;
    private GameView gameView;
    private boolean gameover = false;

    public GameController() {
        gameModel = new GameModel();
        gameView = new GameView();
        gameView.showMap(gameModel.getMap());
    }

    public void run() {
        gameModel.getValidMove();
        while (!gameover) {


        }
    }

    public static int[] convertCoordiante(String input) {
        // in ASCII or Unicode 'a' is represented by 97, so a - a = 0, and b - a = 1 etc.
        int row = input.toLowerCase().charAt(0) - 'a';
        int col = Integer.parseInt(input.substring(1)) - 1;

        return new int[]{row, col};
    }
}

