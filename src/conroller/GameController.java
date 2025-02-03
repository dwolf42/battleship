package conroller;

import model.GameModel;
import model.ship.ShipModel;
import view.MapView;

public class GameController {
    private GameModel gameModel;
    private MapView mapView;
    private boolean gameover;

   public GameController() {
       gameover = false;
       gameModel = new GameModel();
       mapView = new MapView();
       mapView.display(gameModel.getMap());
       gameModel.placeShips();
   }

    public void runGame() {
        while (!gameover) {
            mapView.display(gameModel.getMap());


        }
    }

}

