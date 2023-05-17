package be.intecbrussel.eatables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ConeTest {

    private Cone cone;

    @BeforeEach
    void setUp(){
        cone = new Cone(new Cone.Flavor[]{Cone.Flavor.BANANA});
        System.out.println("Test 1");
    }
    @AfterEach
    void afterAMethod() {
        System.out.println("test done");
    }
    @Test
    void shouldReturnEquals(){
        assertEquals("Cone[BANANA]",cone.toString());
    }

    @Test
    void testPrintEating(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;

        try {
            System.setOut(printStream);

            cone.eat();
            String output = outputStream.toString().trim();

            assertEquals("Eating a delicious cone with [BANANA]", output);
        } finally {
            System.setOut(originalOut);
            printStream.close();
        }
    }
}