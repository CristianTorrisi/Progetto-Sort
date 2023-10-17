package insert_sort;

import java.util.Arrays;
import java.util.Random;

public class Test {


    public static void main(String[] args) {
        /*
        Implemento algoritmo Insertio Sort in un array di interi generati randomicamente
         */

        Random rand = new Random();
        //Limite posto: genero numeri da 0 a 20
        int upperbound = 21;
        int[] array = new int[10];

        //Aggiungo i valori casuali nell'array
        for (int i = 0; i < 10; i++) {
           array[i] = rand.nextInt(upperbound);
        }
        //Stampa array di partenza
        System.out.println(Arrays.toString(array));
        //Array degli elementi ordinati
        int[] array_sorted = new int[array.length];
        //Applico la funzione Insert Sort su array di interi

        // Stampa array ordinato
        System.out.println(Arrays.toString(array_sorted));





    }
}
