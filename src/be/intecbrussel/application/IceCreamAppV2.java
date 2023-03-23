//package be.intecbrussel.application;
//
//import be.intecbrussel.eatables.Cone;
//import be.intecbrussel.eatables.IceRocket;
//import be.intecbrussel.eatables.Magnum;
//import be.intecbrussel.sellers.*;
//
//public class IceCreamAppV2 {
//    public static void main(String[] args) {
//
//        PriceList myPriceList = new PriceList();
//        IceCreamSeller myIceCreamCar = new IceCreamCar(myPriceList, Stock) {
//            @Override
//            public IceRocket orderIceRocket() {
//                return null;
//            }
//
//            @Override
//            public Cone orderCone(Cone.Flavor[] flavors) {
//                return super.orderCone(flavors);
//            }
//
//            @Override
//            public Magnum orderMagnum(Magnum.MagnumType magnumType) {
//                return null;
//            }
//        };
//
//        Cone myCone = IceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA,Cone.Flavor.MOKKA});
//        IceRocket myIceRocket = IceCreamCar.orderIceRocket(new IceRocket());
//
//    }
//}
