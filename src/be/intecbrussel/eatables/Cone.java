package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone() {
    }
    public Cone(Flavor[] balls) {
        this.balls = balls;
    }
    @Override
    public void eat() {
        System.out.println("Eating a delicious " + Arrays.toString(this.balls)+" ");

    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE
    }
}