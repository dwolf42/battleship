package model.navigation;

public class CoordinateModel {
    private int x;
    private int y;
    private boolean isHit;

    public CoordinateModel(int x, int y) {
        this.x = x;
        this.y = y;
        this.isHit = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getIsHit() {
        return isHit;
    }

    public void setIsHit(boolean isHit) {
        this.isHit = isHit;
    }
}
