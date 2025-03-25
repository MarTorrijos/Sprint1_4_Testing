package org.Level_2.ejercici_5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MapTest {

    @BeforeAll
    public static void setUp() {
        Map.getMap().put(1, "balón");
        Map.getMap().put(10, "manzana");
        Map.getMap().put(8, "bizcocho");
    }

    @Test
    void containsKey() {
        assertThat(Map.getMap()).containsKey(1);
    }

}
