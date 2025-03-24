package org.example.Level_1.ejercici_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class dniCalculatorTest {

    @Test
    void calculateLetterTest() {
        dniCalculator operation = new dniCalculator();

        assertEquals("F".charAt(0), operation.calculateLetter(98432210));
        assertEquals("J".charAt(0), operation.calculateLetter(22520877));
        assertEquals("F".charAt(0), operation.calculateLetter(52436741));
        assertEquals("B".charAt(0), operation.calculateLetter(14569752));
    }

}
