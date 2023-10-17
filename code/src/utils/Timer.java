package utils;

import utils.Generator;

public class Timer {

    public static long measureExecutionTime(Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] result = new int[0];
        long randomArrayTime = measureExecutionTime(() -> Generator.randomArray(100, 0, 10000));
        // long randomArrayAscendingTime = measureExecutionTime(() -> Generator.randomArrayAscending(100, 0, 10000));
        // long randomArrayDescendingTime = measureExecutionTime(() -> Generator.randomArrayDescending(100, 0, 10000));
        System.out.println("Execution Time of randomArray(): " + randomArrayTime + " ns.");
        // System.out.println("Execution Time of randomArrayAscending(): " + randomArrayAscendingTime + " ns.");
        // System.out.println("Execution Time of randomArrayDescending(): " + randomArrayDescendingTime + " ns.");
    }
}