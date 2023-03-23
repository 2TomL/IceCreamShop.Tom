package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

import java.net.Proxy;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
        this.profit = profit;
    }

    public double getProfit() {
        return profit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        if (stock.getCones() < 1 && stock.getBalls() < 1 && stock.getBalls() < flavors.length) {
            System.out.println("NO MORE ICECREAM");
            return null;

        } else {
            Cone cone = new Cone();
            for (int i = 0; i < flavors.length; i++) {
                if (stock.getBalls() > 1) {
                    return cone;
                }
            }
        }
        return prepareCone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors) {
            stock.setBalls(stock.getBalls() - 1);
            stock.setBalls(stock.getBalls() - 1);

            profit += (priceList.getRocketPrice() * 0.25);
            System.out.println("Ordered Ice Rocket ");

        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        if (stock.getIceRockets() < 1) {
            System.out.println("NO MORE ICECREAM");
            return null;

        } else {
            IceRocket iceRocket = new IceRocket();

            return prepareIceRocket();
        }
    }

    private IceRocket prepareIceRocket() {
            if (stock.getIceRockets() > 1) {
                stock.iceRockets--;
                profit += (priceList.getRocketPrice() * 0.20);
                System.out.println("Ordered Ice Rocket ");
            }
            return orderIceRocket();
        }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumTypes) {
        if (stock.magni < 1) {
            System.out.println("NO MORE ICECREAM");
        } else {
            Magnum magnum = new Magnum();
                if (stock.magni > 1) {
                    return magnum;
                }
            }
            return prepareMagnum(magnumTypes);
        }

        public Magnum prepareMagnum(Magnum.MagnumType magnumTypes){
            if (stock.magni > 0 ) {
                stock.magni--;
                profit += (priceList.getRocketPrice() * 0.01);
                System.out.println("Ordered Ice Rocket ");
            }
            return orderMagnum(magnumTypes);
        }
}