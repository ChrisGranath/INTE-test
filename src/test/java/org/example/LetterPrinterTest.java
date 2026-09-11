package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LetterPrinterTest {

    @Test
    void printsLetters (){
        LetterPrinter letterPrinter = new LetterPrinter();
        String letter = letterPrinter.getLetter(1);

        assertEquals("a", letter);
    }

}