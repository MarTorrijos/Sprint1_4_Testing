package org.Level_2.ejercici_1;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompareNumbersTest {

    @Test
    void valueIsSame() {
        int num1 = 0;
        int num2 = 0;

        assertThat(CompareNumbers.compareNumbers(num1, num2)).isTrue();
    }

    @Test
    void valueIsDifferent() {
        int num1 = 0;
        int num2 = 1;

        assertThat(CompareNumbers.compareNumbers(num1, num2)).isFalse();
    }

}