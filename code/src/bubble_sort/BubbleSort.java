package bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    // Implementazione di Bubble Sort
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

    public static void main(String[] args) {
        // test Bubble Sort
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array non ordinato: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array ordinato con Bubble Sort: " + Arrays.toString(arr));
    }
}
