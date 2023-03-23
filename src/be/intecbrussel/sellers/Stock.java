package be.intecbrussel.sellers;

public class Stock {
    public int iceRockets = 80;
    public int cones = 100;
    public int balls = 500;
    public int magni = 150;

    public int getIceRockets() {
        return iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public int getBalls() {
        return balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}
