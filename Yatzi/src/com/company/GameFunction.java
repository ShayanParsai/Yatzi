package com.company;
import java.util.Scanner;

public class GameFunction extends Main{

    public static void win(String gameModeChoise) {
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
    public static boolean gameOver() {
        System.out.println("\nGame over!");
        System.out.print("Play again? y or n: ");
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("y")) {
            System.out.print("\n");
            return true;
        } return false;
    }
    public static boolean checkIfWin(Dice[] listOfDices) {
        for(int i=1; i< listOfDices.length; i++) {
            if (listOfDices[i].value != listOfDices[i-1].value) {
             return false;
            }
        } return true;
    }
    public static void rollDice() {
        System.out.println("Starting turn " + (turnCounter+1) + " of 3, rolling dice.");
        for(int i = 0; i< listOfDices.length; i++) {
            listOfDices[i].getRandomNumbers();
            System.out.println(i+1 + ": " + listOfDices[i].getResult());
        }
    }
}