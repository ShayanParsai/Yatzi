package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Main")
public class MainTest extends Main {

    @Test
    @DisplayName("Testing if Yatzi works")
    void isYatziWhenAllDiceIsSame() {
        Dice[] diceArray = new Dice[5];
        for(Dice die: diceArray) {
            die.value = 6;
        }
        //assertEquals(testIfWin, "true", Main.checkIfWin(diceArray));
    }

    /*@Test
    @DisplayName("Testing that its not allways Yatzi")
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for(Dice die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
    } */
}