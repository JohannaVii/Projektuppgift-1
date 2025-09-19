package se.iths.johanna.projektuppgift1;

public class Main {

    // Main-metod - Här anropas alla metoder
    public static void main(String[] args) {
        System.out.println("\nPROJEKTUPPGIFT 1: Metoder och arrayer\n");

        //UPPDATERING - Skapar objekt av klasserna
        TextTools textTools = new TextTools();
        NumberTools numberTools = new NumberTools();

        System.out.println("Metod 1 - String-array\n");
        String[] text = {"Hello", "World", "!"};
        System.out.println("Utskriven array: ");
        textTools.printArray(text);
        System.out.println("\n---\n");

        System.out.println("Metod 2 - Int-array\n");
        int[] values = {-8, 88, -49, 54, 85};
        int maxValue = numberTools.getMaxValue(values);
        System.out.println("Största heltalet i arrayen: ");
        System.out.println(maxValue);
        System.out.println("\n---\n");

        System.out.println("Metod 3 - Två double-parametrar\n");
        double result = numberTools.getMaxDouble(3.14, 0.31);
        System.out.println("Största talet av 3.14 och 0.31: ");
        System.out.println(result + " aka π");
        System.out.println("\n---\n");

        System.out.println("Metod 4 - Två String-parametrar\n");
        //System.out.println("Full name: ");
        System.out.println("My name is Bond, ");
        System.out.println(textTools.printFullName("James", "Bond"));
        System.out.println("\n---\n");
    }
}
