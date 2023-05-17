package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("Eating a delicious cone with " + Arrays.toString(balls));

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
    @Override
    public String toString(){
        return "Cone"+Arrays.toString(balls);
    }
}