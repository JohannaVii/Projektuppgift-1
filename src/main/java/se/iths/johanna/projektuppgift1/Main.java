package se.iths.johanna.projektuppgift1;

public class Main {

    // Metod 1: Skriver ut alla ord i en String-array med mellanslag
    public static void printArray(String[] textArray) {
        for (String text : textArray) {
            System.out.print(text + " ");
        }
    }

    // Metod 2: Returnerar maxtalet i en int-array
    public static int getMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Metod 3: Returnerar maxtalet av två double-parametrar med en ternär operator
    public static double getMaxDouble(double a, double b) {
        return (a > b) ? a : b;
    }

    // Metod 4: Skriver ut två String-parametrar med ett mellanslag
    public static void printFullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    // Main-metod - Här anropas alla metoder
    public static void main(String[] args) {
        System.out.println("\nPROJEKTUPPGIFT: Metoder och arrayer\n");
        System.out.println("Metod 1 - String-array\n");
        String[] text = {"Hello", "World", "!"};
        System.out.println("Utskriven array: ");
        printArray(text);
        System.out.println("\n\n---\n");

        System.out.println("Metod 2 - Int-array\n");
        int[] values = {7, 98, 46, 21, 72};
        int maxValue = getMaxValue(values);
        System.out.println("Största heltalet i arrayen: ");
        System.out.println(maxValue);
        System.out.println("\n---\n");

        System.out.println("Metod 3 - Två double-parametrar\n");
        double result = getMaxDouble(3.14, 0.31);
        System.out.println("Största talet av 3.14 och 0.31: ");
        System.out.println(result + " aka π");
        System.out.println("\n---\n");

        System.out.println("Metod 4 - Två String-parametrar\n");
        //System.out.println("Full name: ");
        System.out.println("My name is Bond, ");
        printFullName("James", "Bond");
        System.out.println("\n---\n");
    }
}
