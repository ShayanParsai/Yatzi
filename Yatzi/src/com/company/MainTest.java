package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Main")
public class MainTest {

    @Test
    @DisplayName("Testing if Yatzi works")
    void checkIfWin() {
        //Check if win works
        Dice[] listOfDices = {new Dice(),new Dice(), new Dice(), new Dice(), new Dice()};
        for(Dice dice: listOfDices) {
            dice.value = 6;
        }
        //Check if loss works
        Dice[] listofDices2 = {new Dice(),new Dice(), new Dice(), new Dice(), new Dice()};
        for(Dice die: listofDices2) {
            die.value = 6;
        }
        listofDices2[3].value = 1;

        assertTrue(GameFunction.checkIfWin(listOfDices)); // Check if win works
        assertFalse(GameFunction.checkIfWin(listofDices2)); // Check if loss works
    }
}

