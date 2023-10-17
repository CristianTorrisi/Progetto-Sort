package utils;

import java.util.Random;

public class Generator {

    public static int[] randomArray(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound);
        }
        return ints;
    }

    public static int[] randomArrayAscending(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound);
            lowerBound = ints[i];
        }
        return ints;
    }

    public static int[] randomArrayDescending(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound);
            upperBound = ints[i];
        }
        return ints;
    }
}

