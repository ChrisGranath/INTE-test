package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberPrinterTest {

    @Test
     void printNumbers(){
        NumberPrinter numberPrinter = new NumberPrinter();

        int a = numberPrinter.getNumber("a");
        int b = numberPrinter.getNumber("hej");

        assertNotEquals(1,a);
        assertEquals(2,b);
    }
}
