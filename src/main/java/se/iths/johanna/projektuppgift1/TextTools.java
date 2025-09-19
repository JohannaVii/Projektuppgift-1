package se.iths.johanna.projektuppgift1;

public class TextTools {

    // Metod 1: Skriver ut alla ord i en String-array med mellanslag
    public void printArray(String[] textArray) {
        for (String text : textArray) {
            System.out.print(text + " ");
        }
        //UPPDATERING - Hoppar till nästa rad
        System.out.println();
    }

    // Metod 4: Skriver ut två String-parametrar med ett mellanslag
    public String printFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
