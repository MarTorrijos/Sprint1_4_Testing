package org.Level_2.ejercici_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayExceptionTest {

    @Test
    void throwException(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> System.out.println(arrayException.myList[5] ));
    }

}