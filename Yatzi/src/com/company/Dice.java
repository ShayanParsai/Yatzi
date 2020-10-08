package com.company;

public class Dice {
    public int value;

    public void getRandomNumbers() {
        value = (int)(Math.random()*6+1);
    }

    public String getResult() {
        return "Dice shows " + value;
    }
}