package org.Level_2.ejercici_4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CheckObjectOrderTest {
    private static Object object1;
    private static Object object2;
    private static Object object3;
    private static Object object4;  // not added on purpose, to pass the last test

    @BeforeAll
    public static void setUp() {
        object1 = new Object("Blue", "cardigan");
        object2 = new Object("Big", "tree");
        object3 = new Object("Lousy", "t-shirt");
        object4 = new Object("Cold", "house");

        Object.getObjects().add(object1);
        Object.getObjects().add(object2);
        Object.getObjects().add(object3);
    }

    @Test
    void checkOrder() {
        assertThat(Object.getObjects()).containsExactly(object1, object2, object3);
    }

    @Test
    void checkThatContains() {
        assertThat(Object.getObjects()).contains(object2, object3, object1);
    }

    @Test
    void notDuplicated() {
        assertThat(Object.getObjects()).containsOnlyOnce(object1);
    }

    @Test
    void notAdded() {
        assertThat(Object.getObjects()).doesNotContain(object4);
    }

}