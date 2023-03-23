//package be.intecbrussel.sellers;
//
//import be.intecbrussel.eatables.Cone;
//import be.intecbrussel.eatables.IceRocket;
//import be.intecbrussel.eatables.Magnum;
//
//public abstract class IceCreamCar implements IceCreamSeller {
//    private PriceList priceList;
//    private Stock stock;
//    private double profit;
//
//    public class OutOfStockException extends RuntimeException {
//    }
//
//    public IceCreamCar Stock(PriceList priceList, Stock stock, double profit) {
//        this.priceList = priceList;
//        this.stock = stock;
//        this.profit = profit;
//    }
//
//    public double getProfit() {
//        return profit;
//    }
//
//    @Override
//    public Cone orderCone(Cone.Flavor[] flavors) {
//        if (stock.cones < 1 && stock.balls < 1) {
//            throw new OutOfStockException();
//        } else {
//            Cone cone = new Cone();
//            for (int i = 0; i < flavors.length; i++) {
//                if (stock.balls < 1) {
//                    throw new OutOfStockException();
//                }
//            }
//        }
//        public Cone prepareCone (Cone.Flavor[]flavors){
//            if (stock.cones > 0 && stock.balls > 0) {
//                stock.cones--;
//                stock.balls--;
//            }
//            return new Cone(flavors);
//        }
//        @Override
//        public IceRocket orderIceRocket () {
//            if (stock.iceRockets < 1) {
//                throw new OutOfStockException();
//            } else {
//                Cone cone = new Cone();
//            }
//        }
//        public Cone prepareIceRocket () {
//            if (stock.iceRockets > 0) {
//                stock.iceRockets--;
//            }
//            return orderIceRocket();
//        }
//    }
//
//    @Override
//    public Cone orderMagnum(Magnum.MagnumType[]magnumTypes) {
//        if (stock.magni < 1 ) {
//            throw new OutOfStockException();
//        } else {
//            Cone cone = new Cone();
//            for (int i = 0; i < magnumTypes.length; i++) {
//                if (stock.magni < 1) {
//                    throw new OutOfStockException();
//                }
//            }
//        }
//        public Cone prepareMagnum (Magnum.MagnumType[]magnumTypes){
//            if (stock.magni > 0 ) {
//                stock.magni--;
//            }
//            return new Magnum(magnumTypes);
//        }
//    }
//
//}