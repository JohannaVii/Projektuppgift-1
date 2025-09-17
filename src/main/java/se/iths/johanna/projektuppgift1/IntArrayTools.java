package se.iths.johanna.projektuppgift1;

public class IntArrayTools {

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
}