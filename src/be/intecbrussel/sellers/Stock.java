package be.intecbrussel.sellers;

public class Stock {
    public int iceRockets;
    public int cones;
    public int balls;
    public int magni;

    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

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
