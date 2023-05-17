package be.intecbrussel.eatables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class IceRocketTest {
    private IceRocket iceRocket;

    @BeforeEach
    void setUp(){
        iceRocket = new IceRocket();
        System.out.println("test started");
    }
    @AfterEach
    void afterAMethod() {
        System.out.println("test done");
    }

    @Test
    void shouldReturnEquals(){
        assertEquals("Ordered Ice Rocket",iceRocket.toString());
    }

    @Test
    void shouldPrintEatingRocket(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        iceRocket.eat();
        String outPut= outputStream.toString().trim();
        assertEquals("Eating an IceRocket!",outPut);
    }
}