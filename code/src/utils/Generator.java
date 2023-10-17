package utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Generator {

    public static int[] randomArray(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound + 1);
        }
        return ints;
    }

    public static int[] randomArrayAscending(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound + 1);
            lowerBound = ints[i];
        }
        return ints;
    }

    public static int[] randomArrayDescending(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound + 1);
            upperBound = ints[i];
        }
        return ints;
    }

    public static int[] randomArrayAscendingSimple(int length, int lowerBound, int upperBound) {
        int[] ints = randomArray(length, lowerBound, upperBound);
        Arrays.sort(ints);
        return ints;
    }

    public static int[] randomArrayDescendingSimple(int length, int lowerBound, int upperBound) {
        int[] ints = randomArray(length, lowerBound, upperBound);
        Arrays.sort(ints);
        return reverse(ints);
    }

    public static int[] reverse(int[] ints) {
        int[] reverse = new int[ints.length];
        for (int i = 0; i < ints.length; i++) reverse[i] = ints[ints.length - i - 1];
        return reverse;
    }


}

