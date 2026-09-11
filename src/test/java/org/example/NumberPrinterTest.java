package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberPrinterTest {

    @Test
     void printNumbers(){
        NumberPrinter numberPrinter = new NumberPrinter();

        int a = numberPrinter.getNumber("");
        int b = numberPrinter.getNumber("hej");

        assertEquals(1,a);
        assertEquals(2,b);
    }
}
