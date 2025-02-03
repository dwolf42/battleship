package conroller;

import model.GameModel;
import model.ship.ShipModel;
import view.MapView;

public class GameController {
    private GameModel gameModel;
    private MapView mapView;
    private boolean gameover = false;

    public void initializeGame() {
        gameModel = new GameModel();
        mapView = new MapView();
        runGame();
    }

    private void runGame() {
        mapView.display(gameModel.getMap());
        gameModel.placeShips();
        while (!gameover) {
            mapView.display(gameModel.getMap());


        }
    }

}

