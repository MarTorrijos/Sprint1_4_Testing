package org.Level_1.ejercici_3;

public class ArrayIndex {

    public static boolean numbersCorrectIndex(int[] numbers) {
        boolean correct = false;
        try {
            System.out.println(numbers[3]);
            correct = true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! ArrayIndexOutOfBoundsException");
        }
        return correct;
    }

}