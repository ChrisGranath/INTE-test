package org.example;

public class Didrik {

    private final String name;
    private final int money;

    public Didrik() {
        this.name = "Didrik";
        this.money = 0;

    }

    public String toString() {
        return "My name is " + name + " " + money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}

