package org.Level_1.ejercici_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniCalculatorTest {

    @Test
    void CalculateLetterTest() {
        assertEquals('F', dniCalculator.calculateLetter(98432210));
        assertEquals('J', dniCalculator.calculateLetter(22520877));
        assertEquals('F', dniCalculator.calculateLetter(52436741));
        assertEquals('B', dniCalculator.calculateLetter(14569752));
    }

}
