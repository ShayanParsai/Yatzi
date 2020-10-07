package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing Main")
public class MainTest {

    @Test
    @DisplayName("Testing if Yatzi works")
    void Main() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }

    }

    @Test
    @DisplayName("Testing that its not allways Yatzi")
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
    }
}