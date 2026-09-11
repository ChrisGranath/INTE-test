package org.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class DidrikTest {

    private static Didrik DIDRIK;
    private final int NO_MONEY = 0;

  @BeforeAll
  public static void setup(){
      DIDRIK = new Didrik();
  }


    @Test
    public void myNameIsDidrikTest() {
        assertEquals("Didrik", DIDRIK.getName());
    }

    @Test
    public void didrikIsBroke() {
        assertEquals(NO_MONEY, DIDRIK.getMoney());
    }
}
