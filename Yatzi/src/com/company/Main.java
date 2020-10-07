package com.company;
import java.util.Scanner;

public class Main {

    public static Dice[] savedRolls;
    private static boolean gameLoop = true;
    public static String gameModeChoise;
    public static boolean testIfWin;

    public static void main(String[] args) {
        PreGame.StartPreGame();

        int turnCounter;
        while(gameLoop) {
            turnCounter = 0;
            while(turnCounter < 3) {
                System.out.println("Starting turn " + (turnCounter+1) + " of 3, rolling dice.");
                for(int i = 0; i< savedRolls.length; i++) {
                    savedRolls[i].DiceRoll();
                    System.out.println(i+1 + ": " + savedRolls[i].getString());
                }
                boolean isYatzi = true;
                for(int i=1; i< savedRolls.length; i++) {
                    if (savedRolls[i].value != savedRolls[i-1].value) {
                        isYatzi = false;
                        break;
                    }
                }
                if(isYatzi) {
                    testIfWin = true;
                    PostGame.StartPostGameWin();
                    return;
                } else {
                    if(turnCounter != 2) {
                        System.out.print("Want to throw again? y or n: ");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            ++turnCounter;
                        } else {
                            gameLoop = false;
                            break;
                        }
                        System.out.print("\n");
                    } else {
                        System.out.println("\nGame over!");
                        System.out.print("Play again? y or n: ");
                        Scanner sc = new Scanner(System.in);
                        if(sc.next().equals("y")) {
                            turnCounter = 0;
                            System.out.print("\n");
                        } else {
                            gameLoop = false;
                            break;
                        }
                    }
                }
            }
        }
    }
}