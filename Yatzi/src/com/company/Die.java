package com.company;

public class Die extends BoardGameMaterial {
    public int value;

    public Die() {
        value = (int) Math.random();
    }

    public void DieRoll() {
        value = (int)(Math.random()*6+1);
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
