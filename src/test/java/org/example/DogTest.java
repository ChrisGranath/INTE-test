package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void dogStatusBad(){
        Dog dog = new Dog(5);
        String status = dog.getStatus(dog);

        assertEquals("badDog", status);

    }

    @Test
    void dogStatusGood(){
        Dog dog = new Dog(11);
        String status = dog.getStatus(dog);

        assertEquals("goodDog", status);
    }

}