package org.Level_1.ejercici_2;

public class dniCalculator {

    public static char calculateLetter(int number) {
        String dni_letter = "TRWAGMYFPDXBNJZSQVHLCKE";
        int rest = number % 23;

        return dni_letter.charAt(rest);
    }

}
