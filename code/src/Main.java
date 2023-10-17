import insert_sort.InsertionSort;
import bubble_sort.BubbleSort;
import utils.Generator;
import utils.Timer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("#########################################################################################");
        System.out.println("######################################### 2TEAM #########################################");
        System.out.println("#########################################################################################");
        int length = 1000; // 10 // 1000 // 100000
        int low = 0;
        int up = 1000000;
        int[] random_array = Generator.randomArray(length, low, up);
        int[] random_ascending_array = Generator.randomArrayAscendingSimple(length, low, up); // Generator.randomArrayAscending(length, low, up);
        int[] random_descending_array = Generator.randomArrayDescendingSimple(length, low, up);// Generator.randomArrayDescending(length, low, up);
        int[] random_array_1 = Arrays.copyOf(random_array, random_array.length);
        int[] random_array_2 = Arrays.copyOf(random_array, random_array.length);
        int[] random_ascending_array_1 = Arrays.copyOf(random_ascending_array, random_array.length);
        int[] random_ascending_array_2 = Arrays.copyOf(random_ascending_array, random_array.length);
        int[] random_descending_array_1 = Arrays.copyOf(random_descending_array, random_array.length);
        int[] random_descending_array_2 = Arrays.copyOf(random_descending_array, random_array.length);
        System.out.println("Il randomArray(): " + Arrays.toString(random_array));
        System.out.println("Il randomArray(): " + Arrays.toString(random_ascending_array));
        System.out.println("Il randomArrayAscending(): " + Arrays.toString(random_descending_array));
        System.out.println("#########################################################################################");
        System.out.println("########################## TABELLA DEI TEMPI DI INSERTION SORT ##########################");
        System.out.println("#########################################################################################");
        long randomArrayTime1, randomArrayAscendingTime1, randomArrayDescendingTime1;
        randomArrayTime1 = Timer.measureExecutionTime(() -> InsertionSort.voidSort(random_array_1));
        randomArrayAscendingTime1 = Timer.measureExecutionTime(() -> InsertionSort.voidSort(random_ascending_array_1));
        randomArrayDescendingTime1 = Timer.measureExecutionTime(() -> InsertionSort.voidSort(random_descending_array_1));
        System.out.println("Il randomArray() ordinato: " + Arrays.toString(random_array_1));
        System.out.println("Il randomArrayAscending() ordinato: " + Arrays.toString(random_ascending_array_1));
        System.out.println("Il randomArrayDescending() ordinato: " + Arrays.toString(random_descending_array_1));
        System.out.println("Execution Time di Insertion sort su randomArray(): " + randomArrayTime1 + " ns.");
        System.out.println("Execution Time di Insertion sort su randomArrayAscending(): " + randomArrayAscendingTime1 + " ns.");
        System.out.println("Execution Time di Insertion sort su randomArrayDescending(): " + randomArrayDescendingTime1 + " ns.");
        System.out.println("#########################################################################################");
        System.out.println("########################## TABELLA DEI TEMPI DI BUBBLE SORT #############################");
        System.out.println("#########################################################################################");
        long randomArrayTime2, randomArrayAscendingTime2, randomArrayDescendingTime2;
        randomArrayTime2 = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_array_2));
        randomArrayAscendingTime2 = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_ascending_array_2)) ;
        randomArrayDescendingTime2 = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_descending_array_2));
        System.out.println("Il randomArray() ordinato: " + Arrays.toString(random_array_2));
        System.out.println("Il randomArrayAscending() ordinato: " + Arrays.toString(random_ascending_array_2));
        System.out.println("Il randomArrayDescending() ordinato: " + Arrays.toString(random_descending_array_2));
        System.out.println("Execution Time di Bubble sort su randomArray(): " + randomArrayTime2 + " ns.");
        System.out.println("Execution Time di Bubble sort su randomArrayAscending(): " + randomArrayAscendingTime2 + " ns.");
        System.out.println("Execution Time di Bubble sort su randomArrayDescending(): " + randomArrayDescendingTime2 + " ns.");
        System.out.println("#########################################################################################");
        System.out.println("######################################## FINE ###########################################");
        System.out.println("#########################################################################################");
    }
}