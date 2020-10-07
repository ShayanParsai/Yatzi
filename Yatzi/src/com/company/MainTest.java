package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing Main")
public class MainTest {

    @Test
    @DisplayName("Testing if Yatzi works")
    void isYatziWhenAllDiceIsSame() {
        Dice[] dice = new Dice[5];
        for(Dice die: dice) {
            die.value = 6;
        }

    }

    @Test
    @DisplayName("Testing that its not allways Yatzi")
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for(Dice die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
    }

}



// To do : easy/hard/impossible förtydliga , 3 olika metoder i pregame
// To do : GamemodeChoice scope
// To do : inte gå för mkt höger ( nest ) fågel
// Aserrtions
