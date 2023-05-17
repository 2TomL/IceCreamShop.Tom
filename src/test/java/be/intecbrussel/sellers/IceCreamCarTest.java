package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class IceCreamCarTest {
    private PriceList priceList;
    private Stock stock;
    private IceCreamCar iceCreamCar;

    @BeforeEach
    public void setUp(){
        priceList = new PriceList(1.5, 2.5, 3.0);
        stock = new Stock(10,10,10,10);
        iceCreamCar = new IceCreamCar(priceList,stock);
    }

    @Test
    void testOrderConeWithEnoughStock(){
        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE,Cone.Flavor.VANILLA,Cone.Flavor.STRAWBERRY};
        Cone cone = iceCreamCar.orderCone(flavors);
        assertNotNull(cone);
        assertEquals(10,stock.getCones());
    }

    @Test
    void testOrderConeWithNotEnoughStock(){
        stock.setCones(0);
        stock.setBalls(1);
        Cone.Flavor[]flavors={Cone.Flavor.CHOCOLATE,Cone.Flavor.VANILLA, Cone.Flavor.STRAWBERRY};
        Cone cone = iceCreamCar.orderCone(flavors);
        assertNull(cone);
    }

    @Test
    void testOrderIceRocketWithEnoughStock(){
        //stock.setIceRockets(2);
        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        assertNotNull(iceRocket);
    }

    @Test
    void testOrderIceRocketWithNotEnoughStock(){
        stock.setIceRockets(0);
        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        assertNull(iceRocket);
    }

    @Test
    void testOrderMagnumWithEnoughStock(){
        Magnum magnum=iceCreamCar.orderMagnum(Magnum.MagnumType.ALPNENUTS);
        assertNotNull(magnum);
        assertEquals(Magnum.MagnumType.ALPNENUTS, magnum.getType());
    }

    @Test
    void testOrderMagnumWithNotEnoughStock(){
        stock.setMagni(0);
        Magnum magnum =iceCreamCar.orderMagnum(Magnum.MagnumType.ALPNENUTS);
        assertNull(magnum);
    }

    @Test
    void shouldReturnNotNullWhenConeIsNotEmpty(){
        assertEquals(0.0,iceCreamCar.getProfit());
        Cone cone = iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE});
        assertNotNull(cone);
    }

    @Test
    void testOrderBalls(){
        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA, Cone.Flavor.STRAWBERRY};
        Cone cone = iceCreamCar.orderCone(flavors);
        assertNotNull(cone);
        assertEquals(10,stock.getBalls());
    }

    @Test
    void testOrderIceRocket(){
        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        assertNotNull(iceRocket);
    }

    @Test
    void testOrderMagnum() {
        Magnum.MagnumType magnumType = Magnum.MagnumType.ALPNENUTS;
        Magnum magnum = iceCreamCar.orderMagnum(magnumType);
        assertNotNull(magnum);
        assertEquals(magnumType, magnum.getType());
    }

    @Test
    void testGetProfit(){
        double initialProfit = iceCreamCar.getProfit();
        Cone.Flavor[]flavors ={
                Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA, Cone.Flavor.STRAWBERRY};
        iceCreamCar.orderCone(flavors);

        Magnum.MagnumType magnumType = Magnum.MagnumType.ALPNENUTS;
        iceCreamCar.orderMagnum(magnumType);

        double expectedProfit = initialProfit + (priceList.getMagnumPrice(Magnum.MagnumType.ALPNENUTS)*0.01)+(flavors.length * priceList.getBallPrice()*0.25);
        assertEquals(expectedProfit, iceCreamCar.getProfit());
        }
    }