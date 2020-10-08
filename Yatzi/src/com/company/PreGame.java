package com.company;
import java.util.Scanner;

public class PreGame extends Main {

    private static boolean preGameLoop = true;

    public static void StartPreGame() {
        Scanner scan = new Scanner(System.in);
        while (preGameLoop) {
            System.out.print("(e)asy / (h)ard / (i)mpossible : ");
            gameModeChoise = scan.next();
            switch (gameModeChoise) {
                case "e" -> EasyMode();
                case "h" -> HardMode();
                case "i" -> ImpossibleMode();
                default -> System.out.println("\nThats an invalid choice, chose between (e)asy/(h)ard or (i)mpossible");
            }
        }
    }
    private static void EasyMode() {
        HowManyDice(3);
        System.out.println("Good luck, the probability of winning is 1/36 or 2,77%, you can do it! \n");
    }
    private static void HardMode() {
        HowManyDice(5);
        System.out.println("Good luck, the probability of winning is 1/1296 or 0.08%, not so likely! \n");
    }
    private static void ImpossibleMode() {
        HowManyDice(7);
        System.out.println("Good luck, the probability of winning is...not likely.. give up buddy :/ \n");
    }
    private static void HowManyDice(int x){
        listOfDices = new Dice[x];
        for(int i=0; i<x; i++) {
            listOfDices[i] = new Dice();
        }
        System.out.println("\nTo win, roll the same number on " + x + " dice");
        preGameLoop = false;
    }
}