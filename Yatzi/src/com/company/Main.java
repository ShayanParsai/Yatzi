package com.company;

import java.util.Scanner;

public class Main {
    public static Die[] savedRolls;
    private static boolean gameLoop = true;
    private static boolean preGameLoop = true;
    public static String gameModeChoise;
    public static boolean testIfWin = false;

    public static void main(String[] args) {

        // Pre Game stars here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my Yatzi game!");
        System.out.println("There are three modes, the easy/hard and impossible version");
        System.out.println("\nPlease chose your gamemode?");
        while (preGameLoop) {
            System.out.print("(e)asy / (h)ard / (i)mpossible : ");
            gameModeChoise = scan.next();
            if(gameModeChoise.equals("e")) {
                savedRolls = new Die[3];
                for(int i=0; i<3; i++) {
                    savedRolls[i] = new Die();
                }
                System.out.println("\nTo win, roll the same number on 3 dices");
                System.out.println("Good luck, the probability of winning is 1/36 or 2,77 %\n");
                preGameLoop = false;
                break;
            } if (gameModeChoise.equals("h")) {
                savedRolls = new Die[5];
                for(int i=0; i<5; i++) {
                    savedRolls[i] = new Die();
                }
                System.out.println("\nTo win, roll the same number on 5 dices");
                System.out.println("Good luck, the probability of winning is 1/1296 or 0.08 %\n");
                preGameLoop = false;
                break;
            } if (gameModeChoise.equals("i")) {
                savedRolls = new Die[7];
                for(int i=0; i<7; i++) {
                    savedRolls[i] = new Die();
                }
                System.out.println("\nTo win, roll the same number on 7 dices");
                System.out.println("Good luck, the probability of winning is.. you wont win.\n");
                preGameLoop = false;
                break;
            } else {
                System.out.println("\nThats an invalid choice, chose between (e)asy/(h)ard or (i)mpossible");
            }
        }

        // Main Game stars here
        int turnCounter;
        while(gameLoop) {
            turnCounter = 0;
            while(turnCounter < 3) {
                System.out.println("Starting turn " + (turnCounter+1) + " of 3, rolling dice.");
                for(int i = 0; i< savedRolls.length; i++) {
                    savedRolls[i].DieRoll();
                    System.out.println(i+1 + ": " + savedRolls[i].getString());
                }
                boolean isYatzi = true;
                for(int i=1; i<5; i++) {
                    if (savedRolls[i].value != savedRolls[i-1].value) {
                        isYatzi = false;
                        break;
                    }
                }
                if(isYatzi) {
                    testIfWin = true; // For assert usage in test
                    switch (gameModeChoise) {
                        case "i" -> {
                            System.out.println("You got YATZI ON IMPOSSIBLE MODE!");
                            System.out.println("No fricking way? Go buy a lottery ticket.");
                        }
                        case "h" -> {
                            System.out.println("You got YATZI on hard mode!");
                            System.out.println("You are pretty lucky!.");
                        }
                        case "e" -> {
                            System.out.println("You got YATZI on easy mode!");
                            System.out.println("Now try the hard mode...");
                        }
                    }
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