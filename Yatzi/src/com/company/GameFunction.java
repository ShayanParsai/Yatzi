package com.company;
import java.util.Scanner;

public class GameFunction extends Main {

    private static byte testIfWin = 0;

    public static void Win(String gameModeChoise) {
        switch (gameModeChoise) {
            case "i" -> { System.out.println("You got YATZI ON IMPOSSIBLE MODE!");
                System.out.println("No fricking way? Go buy a lottery ticket.");
            }
            case "h" -> { System.out.println("You got YATZI on hard mode!");
                System.out.println("You are pretty lucky!.");
            }
            case "e" -> { System.out.println("You got YATZI on easy mode!");
                System.out.println("Now try the hard mode...");
            }
        }
    }
    public static void GameOver() {
        System.out.println("\nGame over!");
        System.out.print("Play again? y or n: ");
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("y")) {
            turnCounter = 0;
            System.out.print("\n");
        } else {
            gameLoop = false;
        }
    }
    public static byte CheckIfWin(Dice[] listOfDices) {
        for(int i=1; i< listOfDices.length; i++) {
            if (listOfDices[i].value != listOfDices[i-1].value) {
                testIfWin = 0;
                isYatzi = false;
                break;
            } else {testIfWin = 1;}
        } return testIfWin;
    }
    public static void RollDice() {
        System.out.println("Starting turn " + (turnCounter+1) + " of 3, rolling dice.");
        for(int i = 0; i< listOfDices.length; i++) {
            listOfDices[i].getRandomNumbers();
            System.out.println(i+1 + ": " + listOfDices[i].getResult());
        }
    }
}