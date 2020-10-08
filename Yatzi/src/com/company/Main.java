package com.company;
import java.util.Scanner;

public class Main {
    public static Dice[] listOfDices;
    public static boolean gameLoop = true;
    private static String gameModeChoise;
    public static int turnCounter = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to my Yatzi game!");
        System.out.println("There are three modes, the easy/hard and impossible version");
        System.out.println("\nPlease chose your gamemode?");
        gameModeChoise = PreGame.startPreGame(gameModeChoise);
        while(gameLoop && turnCounter < 3) {
            GameFunction.rollDice();
            if(GameFunction.checkIfWin(listOfDices)) {
                GameFunction.win(gameModeChoise);
                return;
            } else {
                if(turnCounter != 2) {
                    System.out.print("Want to throw again? y or n: ");
                    Scanner sc = new Scanner(System.in);
                    if(sc.next().equals("y")) {
                        ++turnCounter;
                    } else {
                        gameLoop = false;
                    }
                    System.out.print("\n");
                } else {
                    gameLoop = GameFunction.gameOver();
                    turnCounter = 0;
                }
            }
        }
    }
}