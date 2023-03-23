package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamSalon implements IceCreamSeller{
    public PriceList priceList;
    private double totalProfit;
    @Override
    public double getProfit() {
        return totalProfit;
    }
    public IceCreamSalon(PriceList pricelist) {
        this.totalProfit = 0;
        this.priceList = pricelist;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {

        Cone cone = new Cone(flavors);
        double conePrice = priceList.getBallPrice() * flavors.length;

        totalProfit += (conePrice * 0.25);

        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {

        IceRocket iceRocket = new IceRocket();

        totalProfit += (priceList.getRocketPrice()*0.20);

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {

        Magnum magnum = new Magnum(magnumType);

        totalProfit += (priceList.getMagnumPrice(magnum.getType()) * 0.01);

        return magnum;
    }

}
