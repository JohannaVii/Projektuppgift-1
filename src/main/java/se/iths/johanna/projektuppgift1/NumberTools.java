package se.iths.johanna.projektuppgift1;

public class NumberTools {
    // Metod 2: Returnerar maxtalet i en int-array
    public int getMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Metod 3: Returnerar maxtalet av två double-parametrar med en ternär operator
    public double getMaxDouble(double a, double b) {
        return (a > b) ? a : b;
    }
}
