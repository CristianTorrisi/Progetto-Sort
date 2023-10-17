package insert_sort;

import java.util.Arrays;

public class InsertionSort {
    /**
     * Algoritmo di Insert Sort
     * @param array_source array sorgente da ordinare(inclusi i duplicati)
     * @return array ordinato
     */
   public static int[] returnSort(int[] array_source){
        int[] array_sorted = new int[array_source.length];
        int value_current;
        int j;

        for(int i=0; i<array_source.length;i++){
            value_current = array_source[i];
            j= i-1;

            while (j>=0 && array_source[j] > value_current){
                array_source[j+1] = array_source[j];
                j =j -1;
            }
            array_source[j+1] = value_current;
        }
        array_sorted = array_source;
        return array_sorted;
    }

}
