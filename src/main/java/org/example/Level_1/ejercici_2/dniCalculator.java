package org.example.Level_1.ejercici_2;

public class dniCalculator {

    public static void main(String[] args) {
        int number = 23364877;

        System.out.println("Número de DNI: " + number);
        String letter = calculateLetter(number);
        System.out.println("DNI con la letra calculada: " + number + letter);
    }

    public static String calculateLetter(int number) {
        String dni_letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int rest = number % 23;
        return String.valueOf(dni_letters.charAt(rest));
    }

}
