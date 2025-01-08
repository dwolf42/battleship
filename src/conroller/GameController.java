package conroller;

import model.GameModel;
import view.MapView;

public class GameController {
    private GameModel gameModel;
    private MapView mapView;
    private MapController mapController;
    private boolean gameover = false;

    public GameController() {
        gameModel = new GameModel();
        mapController = new MapController();
        mapView = mapController;
        ShipModel newShip = shipController.createShip()
    }

    public void initializeGame() {
    }

    private void runGame() {
        gameModel.placeShips();
        while (!gameover) {
            mapView.display(gameModel.getMap());


        }
    }

}

