package be.intecbrussel.sellers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    private Stock stock;
    @BeforeEach
    void setUp(){
        stock = new Stock(1,1,1,1);
        System.out.println("testing started");
    }
    @Test
    void shouldReturnEqualsWhenWeSetMagnumStock(){
        stock.setMagni(10);
        assertEquals(10,stock.getMagni());
    }
    @Test
    void shouldReturnEqualsWhenWeSetConeStock(){
        stock.setCones(13);
        assertEquals(13,stock.getCones());
    }
    @Test
    void shouldReturnEqualsWhenWeSetBallsStock(){
        stock.setBalls(20);
        assertEquals(20,stock.getBalls());
    }
    @Test
    void shouldReturnEqualsWhenWeSetIceRocketStock(){
        stock.setIceRockets(15);
        assertEquals(15,stock.getIceRockets());
    }
    @Test
    void shouldReturnEqualsWhenWeSetMagnumStockToLessThenZero(){
        Executable executable = ()->stock.setMagni(-5);
        assertThrows(IllegalArgumentException.class,executable);
    }

    @Test
    void shouldReturnEqualsWhenWeSetConeStockToLessThenZero(){
        Executable executable = ()->stock.setMagni(-6);
        assertThrows(IllegalArgumentException.class,executable);
    }

    @Test
    void shouldReturnEqualsWhenWeSetBallsStockToLessThenZero(){
        Executable executable = ()->stock.setBalls(-1);
        assertThrows(IllegalArgumentException.class,executable);
    }
    @Test
    void shouldReturnEqualsWhenWeSetIceRocketStockToLessThenZero(){
        Executable executable = ()->stock.setMagni(-9);
        assertThrows(IllegalArgumentException.class,executable);
    }
    @Test
    void shouldReturnEqualsForMagnum(){

        assertEquals(1,stock.getMagni());
    }
    @Test
    void shouldReturnEqualsForCone(){

        assertEquals(1,stock.getCones());
    }
    @Test
    void shouldReturnEqualsForBalls(){

        assertEquals(1,stock.getBalls());
    }
    @Test
    void shouldReturnEqualsForIceRocket(){

        assertEquals(1,stock.getIceRockets());
    }


}