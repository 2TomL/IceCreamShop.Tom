package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class IceCreamSalonTest {
    private PriceList priceList;
    private Stock stock;
    private IceCreamSalon iceCreamSalon;

    @BeforeEach
    public void setUp(){
        priceList = new PriceList(1.5, 2.5, 3.0);
        stock = new Stock(10,10,10,10);
        iceCreamSalon = new IceCreamSalon(priceList);
    }

    @Test
    void testOrderConeWithEnoughStock(){
        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE,Cone.Flavor.VANILLA,Cone.Flavor.STRAWBERRY};
        Cone cone = iceCreamSalon.orderCone(flavors);
        assertNotNull(cone);
        assertEquals(10, stock.getCones());
    }

    @Test
    void testOrderConeWithNotEnoughStock(){
        stock.setCones(0);
        stock.setBalls(1);
        Cone.Flavor[]flavors={Cone.Flavor.CHOCOLATE,Cone.Flavor.VANILLA, Cone.Flavor.STRAWBERRY};
        Cone cone = iceCreamSalon.orderCone(flavors);
        assertNotNull(cone);
    }

    @Test
    void testOrderIceRocketWithEnoughStock(){
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        assertNotNull(iceRocket);
    }

    @Test
    void testOrderIceRocketWithNotEnoughStock(){
        stock.setIceRockets(0);
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        assertNotNull(iceRocket);
    }

    @Test
    void testOrderMagnumWithEnoughStock(){
        Magnum magnum=iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPNENUTS);
        assertNotNull(magnum);
        assertEquals(Magnum.MagnumType.ALPNENUTS, magnum.getType());
    }

    @Test
    void testOrderMagnumWithNotEnoughStock(){
        stock.setMagni(0);
        Magnum magnum =iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPNENUTS);
        assertNotNull(magnum);
    }

    @Test
    void shouldReturnNotNullWhenConeIsNotEmpty(){
        assertEquals(0.0,iceCreamSalon.getProfit());
        Cone cone = iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.CHOCOLATE});
        assertNotNull(cone);
    }


    @Test
    void testOrderCone(){
        Cone.Flavor[] flavors = {Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA, Cone.Flavor.STRAWBERRY};
        Cone cone = iceCreamSalon.orderCone(flavors);
        assertNotNull(cone);
        assertEquals(10, stock.getBalls());
        System.out.println("testOrderCone");
    }

    @Test
    void testOrderIceRocket(){
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        assertNotNull(iceRocket);
        System.out.println("testOrderIceRocket");
    }

    @Test
    void testOrderMagnum() {
        Magnum.MagnumType magnumType = Magnum.MagnumType.ALPNENUTS;
        Magnum magnum = iceCreamSalon.orderMagnum(magnumType);
        assertNotNull(magnum);
        assertEquals(magnumType, magnum.getType());
        System.out.println("testOrderMagnum");
    }

    @Test
    void testGetProfit() {
        double initialProfit = iceCreamSalon.getProfit();
        Cone.Flavor[] flavors = {
                Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA, Cone.Flavor.STRAWBERRY};
        iceCreamSalon.orderCone(flavors);

        Magnum.MagnumType magnumType = Magnum.MagnumType.ALPNENUTS;
        iceCreamSalon.orderMagnum(magnumType);

        double expectedProfit = initialProfit + (flavors.length * priceList.getBallPrice() * 0.25) + (priceList.getMagnumPrice(magnumType) * 0.01);
        assertEquals(expectedProfit, iceCreamSalon.getProfit());
        System.out.println("Last testGetProfit");
    }
}