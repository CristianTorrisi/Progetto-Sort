import bubble_sort.BubbleSort;
import insert_sort.InsertionSort;
import utils.Generator;
import utils.Timer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Printing.print1();
        int[] arrLength={10,1000,100000};
        int resultsNumber=10;
        long[][] arrTime1= new long[resultsNumber][arrLength.length];
        System.out.println("Bubble Sort");
        for(int i=0;i<arrLength.length;i++){
            creaTempiOrdinamento(resultsNumber,arrLength[i],arrTime1);
            System.out.println("Caso di numero elementi: "+ arrLength[i]);
            System.out.println(Arrays.deepToString(arrTime1));

        }
        System.out.println("Insertion Sort");
        for(int i=0;i<arrLength.length;i++){
            creaTempiOrdinamento1(resultsNumber,arrLength[i],arrTime1);
            System.out.println("Caso di numero elementi: "+ arrLength[i]);
            System.out.println(Arrays.deepToString(arrTime1));

        }
    }

    private static void creaTempiOrdinamento1(int resultsNumber, int length, long[][] arrTime) {
        int low=0;
        int up= 10000000;
        for (int i=0;i<resultsNumber;i++) {
            int[] random_array = Generator.randomArray(length, low, up);
            int[] random_ascending_array = Generator.randomArrayAscendingSimple(length, low, up); // Generator.randomArrayAscending(length, low, up);
            int[] random_descending_array = Generator.randomArrayDescendingSimple(length, low, up);// Generator.randomArrayDescending(length, low, up);

            long randomArrayTime, randomArrayAscendingTime, randomArrayDescendingTime;
            randomArrayTime = Timer.measureExecutionTime(() -> InsertionSort.voidSort(random_array));
            randomArrayAscendingTime = Timer.measureExecutionTime(() -> InsertionSort.voidSort(random_ascending_array));
            randomArrayDescendingTime = Timer.measureExecutionTime(() -> InsertionSort.voidSort(random_descending_array));
            arrTime[i][0]=randomArrayTime;
            arrTime[i][1]=randomArrayAscendingTime;
            arrTime[i][2]=randomArrayDescendingTime;
        }
    }

    private static void creaTempiOrdinamento(int resultsNumber, int length, long[][] arrTime) {
        int low=0;
        int up= 10000000;
        for (int i=0;i<resultsNumber;i++) {
            int[] random_array = Generator.randomArray(length, low, up);
            int[] random_ascending_array = Generator.randomArrayAscendingSimple(length, low, up); // Generator.randomArrayAscending(length, low, up);
            int[] random_descending_array = Generator.randomArrayDescendingSimple(length, low, up);// Generator.randomArrayDescending(length, low, up);

            long randomArrayTime, randomArrayAscendingTime, randomArrayDescendingTime;
            randomArrayTime = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_array));
            randomArrayAscendingTime = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_ascending_array)) ;
            randomArrayDescendingTime = Timer.measureExecutionTime(() -> BubbleSort.bubbleSort(random_descending_array));
            arrTime[i][0]=randomArrayTime;
            arrTime[i][1]=randomArrayAscendingTime;
            arrTime[i][2]=randomArrayDescendingTime;
        }
    }
}