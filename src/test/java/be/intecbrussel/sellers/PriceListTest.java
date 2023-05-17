package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceListTest {
    private PriceList priceList;

    @BeforeEach
    void setUp(){
        priceList = new PriceList(1,2,3);
    }

    @AfterEach
    void afterMethod(){
        System.out.println("Test done");
    }
    @Test
    void testGetBallPrice() {
        double expectedBallPrice = 1.0;
        assertEquals(expectedBallPrice, priceList.getBallPrice());
    }

    @Test
    void testGetRocketPrice() {
        double expectedRocketPrice = 2.0;
        assertEquals(expectedRocketPrice, priceList.getRocketPrice());
    }

    @Test
    void testGetMagnumPrice() {
        double expectedStandardPrice = 3.0;

        assertEquals(expectedStandardPrice, priceList.getMagnumPrice(Magnum.MagnumType.WHITECHOCOLATE));
        assertEquals(expectedStandardPrice, priceList.getMagnumPrice(Magnum.MagnumType.MILKCHOCOLATE));
        assertEquals(expectedStandardPrice, priceList.getMagnumPrice(Magnum.MagnumType.BLACKCHOCOLATE));

        double expectedAlpneNutsPrice = expectedStandardPrice * 1.5;
        assertEquals(expectedAlpneNutsPrice, priceList.getMagnumPrice(Magnum.MagnumType.ALPNENUTS));

        double expectedRomanticStrawberriesPrice = expectedStandardPrice * 1.75;
        assertEquals(expectedRomanticStrawberriesPrice, priceList.getMagnumPrice(Magnum.MagnumType.ROMANTICSTRAWBERRIES));
    }

    @Test
    void testGetMagnumStandardPrice() {
        double expectedStandardPrice = 3.0;
        assertEquals(expectedStandardPrice, PriceList.getMagnumStandardPrice());
    }

    @Test
    void testSetBallPrice() {
        double newBallPrice = 1.5;
        priceList.setBallPrice(newBallPrice);
        assertEquals(newBallPrice, priceList.getBallPrice());
    }

    @Test
    void testSetRocketPrice() {
        double newRocketPrice = 2.5;
        priceList.setRocketPrice(newRocketPrice);
        assertEquals(newRocketPrice, priceList.getRocketPrice());
    }

    @Test
    void testSetMagnumStandardPrice() {
        double newStandardPrice = 3.5;
        priceList.setMagnumStandardPrice(newStandardPrice);
        assertEquals(newStandardPrice, PriceList.getMagnumStandardPrice());
    }

}