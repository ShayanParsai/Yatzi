package com.company;

import java.util.Scanner;

public class PreGame extends Main {

    private static boolean preGameLoop = true;

    public static void StartPreGame() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my Yatzi game!");
        System.out.println("There are three modes, the easy/hard and impossible version");
        System.out.println("\nPlease chose your gamemode?");
        while (preGameLoop) {
            System.out.print("(e)asy / (h)ard / (i)mpossible : ");
            gameModeChoise = scan.next();
            if(gameModeChoise.equals("e")) {
                savedRolls = new Dice[3];
                for(int i=0; i<3; i++) {
                    savedRolls[i] = new Dice();
                }
                System.out.println("\nTo win, roll the same number on 3 dices");
                System.out.println("Good luck, the probability of winning is 1/36 or 2,77 %\n");
                preGameLoop = false;
                break;
            } if (gameModeChoise.equals("h")) {
                savedRolls = new Dice[5];
                for(int i=0; i<5; i++) {
                    savedRolls[i] = new Dice();
                }
                System.out.println("\nTo win, roll the same number on 5 dices");
                System.out.println("Good luck, the probability of winning is 1/1296 or 0.08 %\n");
                preGameLoop = false;
                break;
            } if (gameModeChoise.equals("i")) {
                savedRolls = new Dice[7];
                for(int i=0; i<7; i++) {
                    savedRolls[i] = new Dice();
                }
                System.out.println("\nTo win, roll the same number on 7 dices");
                System.out.println("Good luck, the probability of winning is.. you wont win.\n");
                preGameLoop = false;
                break;
            } else {
                System.out.println("\nThats an invalid choice, chose between (e)asy/(h)ard or (i)mpossible");
            }
        }
    }
}