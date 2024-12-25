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
    }

    public void run() {
        gameModel.placeShips();
        while (!gameover) {
            gameView.showMap(gameModel.getMap());


        }
    }

}

