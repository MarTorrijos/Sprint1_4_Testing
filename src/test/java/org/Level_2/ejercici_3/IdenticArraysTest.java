package org.Level_2.ejercici_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class IdenticArraysTest {

    @Test
    void arraysAreEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        assertThat(IdenticArrays.checkArrays(array1, array2)).isTrue();
    }

}
