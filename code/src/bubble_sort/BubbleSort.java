package bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Algoritmo di ordinamento Bubble Sort
     * @param arr array da ordinare
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Scambia arr[j] e arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se non è stato fatto nessuno scambio, l'array è già ordinato
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Algortimo di ordinamento Bubble Sort
     * @param arr array da ordinare
     * @return array ordinato
     */
    public static int[] returnBubbleSort(int[] arr){
        int[] array_sorted = new int[arr.length];
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Scambia arr[j] e arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se non è stato fatto nessuno scambio, l'array è già ordinato
            if (!swapped) {
                array_sorted = arr;

            }
        }
        return array_sorted;
    }

    public static void main(String[] args) {
        // test Bubble Sort
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] array_sorted = new int[arr.length];

        System.out.println("Array non ordinato: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array ordinato con Bubble Sort: " + Arrays.toString(arr));
        array_sorted = returnBubbleSort(arr);
        System.out.println("Array ordinato con Bubble Sort 2: " + Arrays.toString(array_sorted));
    }
}
