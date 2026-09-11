package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JuliaTest {

    @Test
    void juliasTest (){

        JuliasClass hej = new JuliasClass();
        String test = hej.tester();

        assertEquals("test", test);
    }
}
