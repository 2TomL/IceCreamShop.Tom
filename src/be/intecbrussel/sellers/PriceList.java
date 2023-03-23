package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    double ballPrice = 1.0;
    double rocketPrice = 2.0;
    static double magnumStandardPrice = 3.0;

    public PriceList() {

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        switch (type) {
            case WHITECHOCOLATE:
            case MILKCHOCOLATE:
            case BLACKCHOCOLATE:
                return magnumStandardPrice;

            case ALPNENUTS:
                return magnumStandardPrice * 1.5;

            case ROMANTICSTRAWBERRIES:
                return magnumStandardPrice * 1.75;
            default:
                throw new IllegalArgumentException("Invalid Magnum type ");
        }
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

}
