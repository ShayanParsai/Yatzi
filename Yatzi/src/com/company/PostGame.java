package com.company;


public class PostGame extends Main {

    public static void StartPostGameWin() {

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
    }
}
