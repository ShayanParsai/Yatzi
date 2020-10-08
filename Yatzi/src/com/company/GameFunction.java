package com.company;
import java.util.Scanner;

public class GameFunction extends Main {

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
    public static void CheckIfWin() {
        for(int i=1; i< savedRolls.length; i++) {
            if (savedRolls[i].value != savedRolls[i-1].value) {
                isYatzi = false;
                break;
            }
        }
    }
    public static void RollDice() {
        System.out.println("Starting turn " + (turnCounter+1) + " of 3, rolling dice.");
        for(int i = 0; i< savedRolls.length; i++) {
            savedRolls[i].GetRandomNumbers();
            System.out.println(i+1 + ": " + savedRolls[i].getResult());
        }
    }
}