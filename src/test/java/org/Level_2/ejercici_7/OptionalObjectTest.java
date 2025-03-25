package org.Level_2.ejercici_7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class OptionalObjectTest {

    @Test
    void isObjectEmpty() {
        Optional<Object> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }

}