package be.intecbrussel.eatables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MagnumTest {
    private Magnum magnum;

    @BeforeEach
    void setUp(){

        magnum = new Magnum(Magnum.MagnumType.WHITECHOCOLATE);
        System.out.println("test started");
    }
    @AfterEach
    void afterAMethod() {

        System.out.println("test done");
    }
    @Test
    void shouldReturnEquals() {

        assertEquals("Magnum WHITECHOCOLATE", magnum.toString());
    }
    @Test
    void shouldReturnEqualsType(){

        assertEquals(Magnum.MagnumType.WHITECHOCOLATE,magnum.getType());
    }

    @Test
    void testPrintEating(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        magnum.eat();
        String outPut = outputStream.toString().trim();
        assertEquals("Eating a delicious WHITECHOCOLATE",outPut);
    }

}