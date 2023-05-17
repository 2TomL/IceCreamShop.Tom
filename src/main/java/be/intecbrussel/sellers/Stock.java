package be.intecbrussel.sellers;

public class Stock {
    private int iceRockets = 20;
    private int cones = 20;
    private int balls = 70;
    private int magni = 2;

    public Stock(int iceRockets, int cones, int balls, int magni) {
        setIceRockets(iceRockets);
        setCones(cones);
        setBalls(balls);
        setMagni(magni);
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        if (iceRockets >= 0){
            this.iceRockets = iceRockets;
        }else throw new  IllegalArgumentException ("INVALID INPUT");
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        if (cones >= 0){
            this.cones = cones;
        }else throw new  IllegalArgumentException ("INVALID INPUT");
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        if (balls >= 0){
            this.balls = balls;
        }else throw new  IllegalArgumentException ("INVALID INPUT");
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        if (magni >= 0){
            this.magni = magni;
        }else throw new  IllegalArgumentException ("INVALID INPUT");
    }
}