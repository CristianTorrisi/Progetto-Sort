import insert_sort.InsertionSort;
import utils.Generator;
import utils.Timer;
import bubble_sort.BubbleSort;

import java.util.Arrays;

import static bubble_sort.BubbleSort.bubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] result = new int[0];
        long randomArrayTime = Timer.measureExecutionTime(() -> Generator.randomArray(100, 0, 10000));
        long randomArrayAscendingTime = Timer.measureExecutionTime(() -> Generator.randomArrayAscending(100, 0, 10000));
        long randomArrayDescendingTime = Timer.measureExecutionTime(() -> Generator.randomArrayDescending(100, 0, 10000));

        int[] insert_array = InsertionSort.returnSort(Generator.randomArray(100, 0, 10000));
        int[] buble_array = (Generator.randomArray(100, 0, 10000));
        bubbleSort(buble_array);

        System.out.println("------TABELLA DEI TEMPI DI INSERT SORT -------------");
        System.out.println(Arrays.toString(insert_array));
        int[] random_array_insert = Generator.randomArray(100, 0, 10000);
        int[] random_ascending_array_insert = Generator.randomArrayAscending(100, 0, 10000);
        int[] random_descending_array_insert = Generator.randomArrayDescending(100, 0, 10000);

         randomArrayTime = Timer.measureExecutionTime(() -> InsertionSort.returnSort(random_array_insert));
         randomArrayAscendingTime = Timer.measureExecutionTime(() ->InsertionSort.returnSort(random_ascending_array_insert)) ;
         randomArrayDescendingTime = Timer.measureExecutionTime(() ->InsertionSort.returnSort(random_descending_array_insert)) ;

        System.out.println("Execution Time of Insertion sort on randomArray(): " + randomArrayTime + " ns.");
        System.out.println("Execution Time of Insertion sort on randomArrayAscending(): " + randomArrayAscendingTime + " ns.");
        System.out.println("Execution Time of Insertion sort on randomArrayDescending(): " + randomArrayDescendingTime + " ns.");

        System.out.println("------TABELLA DEI TEMPI BUBBLE SORT -------------");


        int[] random_array_bubble = Generator.randomArray(100, 0, 10000);
        int[] random_ascending_array_bubble = Generator.randomArrayAscending(100, 0, 10000);
        int[] random_descending_array_bubble = Generator.randomArrayDescending(100, 0, 10000);

        randomArrayTime = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_array_bubble));
        randomArrayAscendingTime = Timer.measureExecutionTime(() ->BubbleSort.bubbleSort(random_ascending_array_bubble)) ;
        randomArrayDescendingTime = Timer.measureExecutionTime(() ->BubbleSort.bubbleSort(random_descending_array_bubble));

        System.out.println("Execution Time of Bubble sort on randomArray(): " + randomArrayTime + " ns.");
        System.out.println("Execution Time of Bubble sort on randomArrayAscending(): " + randomArrayAscendingTime + " ns.");
        System.out.println("Execution Time of Bubble sort on randomArrayDescending(): " + randomArrayDescendingTime + " ns.");

        System.out.println(Arrays.toString(buble_array));


    }
}