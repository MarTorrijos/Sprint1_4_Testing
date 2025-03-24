package org.example.Level_1.ejercici_3;

public class ArrayIndex {

    static int[] numbers = {1,2,3};

    public static void getNumbersError() {
        for (int i = 0; i < numbers.length + 1; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void getNumbersCorrect() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
