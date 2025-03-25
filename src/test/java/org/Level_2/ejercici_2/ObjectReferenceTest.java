package org.Level_2.ejercici_2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ObjectReferenceTest {

    @Test
    void isSameObject() {
        Object object1 = (1);
        Object object2 = (1);
        assertThat(ObjectReference.isSameObject(object1, object2)).isTrue();
    }

    @Test
    void isDifferentObject() {
        Object object1 = (1);
        Object object2 = (2);
        assertThat(ObjectReference.isSameObject(object1, object2)).isFalse();
    }

}