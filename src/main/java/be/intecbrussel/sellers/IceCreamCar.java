package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

import java.awt.*;
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
        if (stock.getCones() < 1 && stock.getBalls() < flavors.length) {
            System.out.println("OUT OF ICECREAM");
            return null;

        } else if (stock.getBalls() > 1) {
            prepareCone(flavors);
            return new Cone(flavors);
        }
        return null;
    }


    private Cone prepareCone(Cone.Flavor[] flavors) {
            stock.setCones(stock.getCones()-1);
            stock.setBalls(stock.getBalls() - flavors.length);
            profit += (priceList.getBallPrice() * flavors.length * 0.25);

        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        if (stock.getIceRockets() < 1) {
            System.out.println("OUT OF ICECREAM");
            return null;

        } else {
            return prepareIceRocket();
        }
    }

    private IceRocket prepareIceRocket() {
            if (stock.getIceRockets() > 0) {
                stock.setIceRockets(stock.getIceRockets()-1);
                profit += (priceList.getRocketPrice() * 0.20);
                System.out.println("Ordered Ice Rocket ");
                return new IceRocket();
            }
            return null;
        }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumTypes) {
        if (stock.getMagni() < 1) {
            System.out.println("OUT OF ICECREAM");
        } else {
            Magnum magnum = new Magnum(magnumTypes);
                if (stock.getMagni() > 1) {
                    return prepareMagnum(magnumTypes);
                }
            }
            return prepareMagnum(magnumTypes);
        }

        public Magnum prepareMagnum(Magnum.MagnumType magnumTypes){
            if (stock.getMagni() > 0 ) {
                stock.setMagni(stock.getMagni()-1);
                profit += (priceList.getMagnumPrice(magnumTypes) * 0.01);
                return new Magnum(magnumTypes);
            }
            return null;
        }
}