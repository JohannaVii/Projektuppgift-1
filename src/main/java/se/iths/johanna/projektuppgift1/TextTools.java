package se.iths.johanna.projektuppgift1;

public class TextTools {

    // Metod 1: Skriver ut alla ord i en String-array med mellanslag
    public static void printArray(String[] textArray) {
        for (String text : textArray) {
            System.out.print(text + " ");
        }
    }

    // Metod 4: Skriver ut två String-parametrar med ett mellanslag
    public static void printFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}
