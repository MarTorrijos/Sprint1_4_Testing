package org.Level_1.ejercici_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayIndexTest {

    @Test
    void correctIndex() {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3, 4};

        assertFalse(ArrayIndex.numbersCorrectIndex(numbers1));
        assertTrue(ArrayIndex.numbersCorrectIndex(numbers2));
    }

    @Test
    void indexNotEmpty() {
        int[] numbers1 = {};
        int[] numbers2 = {1, 2, 3};

        assertEquals(0, numbers1.length, "La lista no debería estar vacía");
        assertTrue(numbers2.length > 0);
    }

}