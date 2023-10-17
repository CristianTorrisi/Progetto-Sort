import insert_sort.InsertionSort;
import utils.Generator;
import utils.Timer;
import bubble_sort.BubbleSort;

import java.util.Arrays;

import static bubble_sort.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        long randomArrayTime, randomArrayAscendingTime, randomArrayDescendingTime;
        int length = 10;
        int low = 0;
        int up = 100000;

        int[] random_array = Generator.randomArray(length, low, up);
        int[] random_ascending_array = Generator.randomArrayAscending(length, low, up);
        int[] random_descending_array = Generator.randomArrayDescending(length, low, up);

        int[] random_array_1 = Arrays.copyOf(random_array, random_array.length);
        int[] random_ascending_array_1 = Arrays.copyOf(random_ascending_array, random_array.length);
        int[] random_descending_array_1 = Arrays.copyOf(random_descending_array, random_array.length);

        int[] random_array_2 = Arrays.copyOf(random_array, random_array.length);
        int[] random_ascending_array_2 = Arrays.copyOf(random_ascending_array, random_array.length);
        int[] random_descending_array_2 = Arrays.copyOf(random_descending_array, random_array.length);

        System.out.println("#########################################################################################");
        System.out.println("########################## TABELLA DEI TEMPI DI INSERTION SORT ##########################");
        System.out.println("#########################################################################################");
        int[] random_array_insert = Generator.randomArray(length, low, up);
        int[] random_ascending_array_insert = Generator.randomArrayAscending(length, low, up);
        int[] random_descending_array_insert = Generator.randomArrayDescending(length, low, up);
        System.out.println("Il randomArray():" + Arrays.toString(random_array_insert));
        System.out.println("Il randomArrayAscending(): " + Arrays.toString(random_ascending_array_insert));
        System.out.println("Il randomArrayAscending(): " + Arrays.toString(random_descending_array_insert));
        randomArrayTime = Timer.measureExecutionTime(() -> InsertionSort.returnSort(random_array_insert));
        randomArrayAscendingTime = Timer.measureExecutionTime(() -> InsertionSort.returnSort(random_ascending_array_insert));
        randomArrayDescendingTime = Timer.measureExecutionTime(() -> InsertionSort.returnSort(random_descending_array_insert));
        System.out.println("Il randomArray() ordinato:" + Arrays.toString(random_array_insert));
        System.out.println("Il randomArrayAscending() ordinato:" + Arrays.toString(random_ascending_array_insert));
        System.out.println("Il randomArrayDescending() ordinato:" + Arrays.toString(random_descending_array_insert));
        System.out.println("Execution Time di Insertion sort su randomArray(): " + randomArrayTime + " ns.");
        System.out.println("Execution Time di Insertion sort su randomArrayAscending(): " + randomArrayAscendingTime + " ns.");
        System.out.println("Execution Time di Insertion sort su randomArrayDescending(): " + randomArrayDescendingTime + " ns.");
        System.out.println("#########################################################################################");
        System.out.println("########################## TABELLA DEI TEMPI DI BUBBLE SORT #############################");
        System.out.println("#########################################################################################");
        int[] random_array_bubble = Generator.randomArray(length, low, up);
        int[] random_ascending_array_bubble = Generator.randomArrayAscending(length, low, up);
        int[] random_descending_array_bubble = Generator.randomArrayDescending(length, low, up);
        System.out.println("Il randomArray():" + Arrays.toString(random_array_bubble));
        System.out.println("Il randomArrayAscending(): " + Arrays.toString(random_ascending_array_bubble));
        System.out.println("Il randomArrayAscending(): " + Arrays.toString(random_descending_array_bubble));
        randomArrayTime = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_array_bubble));
        randomArrayAscendingTime = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_ascending_array_bubble)) ;
        randomArrayDescendingTime = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_descending_array_bubble));
        System.out.println("Il randomArray() ordinato:" + Arrays.toString(random_array_bubble));
        System.out.println("Il randomArrayAscending() ordinato:" + Arrays.toString(random_ascending_array_bubble));
        System.out.println("Il randomArrayDescending() ordinato:" + Arrays.toString(random_descending_array_bubble));
        System.out.println("Execution Time of Bubble sort on randomArray(): " + randomArrayTime + " ns.");
        System.out.println("Execution Time of Bubble sort on randomArrayAscending(): " + randomArrayAscendingTime + " ns.");
        System.out.println("Execution Time of Bubble sort on randomArrayDescending(): " + randomArrayDescendingTime + " ns.");
        System.out.println("#########################################################################################");
        System.out.println("######################################## FINE ###########################################");
        System.out.println("#########################################################################################");
    }
}