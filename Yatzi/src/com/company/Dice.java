package com.company;

public class Dice {
    public int value;

    public Dice() {
        value = (int) Math.random();
    }

    public void DiceRoll() {
        value = (int)(Math.random()*6+1);
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
