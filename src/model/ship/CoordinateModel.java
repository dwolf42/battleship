package model.ship;

import model.ConstantsModel;

import java.util.Scanner;

public class CoordinateModel {
    private int x;
    private int y;
    private boolean isHit;

    public CoordinateMo del(int x, int y, boolean isHit) {
        this.x = x;
        this.y = y;
        this.isHit = isHit
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public getIsHit() {
        return isHit;
    }

    public setIsHit(boolean isHit) {
        this.isHit = isHit;
    }
}
