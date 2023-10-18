# Progetto di Laboratorio
![image](https://github.com/CristianTorrisi/Progetto-Sort/assets/146428019/c9232478-220d-463a-9ce5-99cb3b9bd84e)
# Indice
- [Insert Sort](#Insert-Sort)
- [Bubble Sort](#Bubble-Sort)
- [Timer e Generator](#Time-e-Generator)
- [Membri gruppo](#Membri-del-gruppo)



# Insert Sort 

Compito: dato come parametro l'array di interi generati casualmente,implento l'algoritmo di ordinamento Insert Sort che mi restituisce un array di numeri interi casuali ordinato. 

  ![use-template](https://github.com/CristianTorrisi/Progetto-Sort/assets/146428019/c0b0e6a4-bcd6-488d-b34e-8fca374e3c0a)
```java
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
```
## Analisi Complessità

Best case  O(n)

Worst case  O(n)

Average case  O(n^2)




# Bubble Sort 
Compito: dato come parametro l'array di interi generati casualmente,implento l'algoritmo di ordinamento Bubble Sort che mi restituisce un array di numeri interi casuali ordinato. 

 ![use-template](https://github.com/CristianTorrisi/Progetto-Sort/assets/146428019/fab1980e-6df4-4196-99a8-feff459e9e8b)
 
```java
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
```
## Analisi Complessità

Best case  O(n^2)

Worst case  O(n^2)

Average case  O(n^2)

# Time e Generator
```java
public static long measureExecutionTime(Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
```
```java
public static int[] randomArray(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound + 1);
        }
        return ints;
    }
```
```java
public static int[] randomArrayAscending(int length, int lowerBound, int upperBound) {
        Random random = new Random();
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(lowerBound, upperBound + 1);
            lowerBound = ints[i];
        }
        return ints;
    }
```
```java
public static int[] randomArrayAscendingSimple(int length, int lowerBound, int upperBound) {
        int[] ints = randomArray(length, lowerBound, upperBound);
        Arrays.sort(ints);
        return ints;
    }
```
```java
public static int[] randomArrayDescendingSimple(int length, int lowerBound, int upperBound) {
        int[] ints = randomArray(length, lowerBound, upperBound);
        Arrays.sort(ints);
        return reverse(ints);
    }

public static int[] reverse(int[] ints) {
        int[] reverse = new int[ints.length];
        for (int i = 0; i < ints.length; i++) reverse[i] = ints[ints.length - i - 1];
        return reverse;
    }
```


# Risultati 
Abbiamo valutato le prestazioni di Insertion Sort e Bubble Sort per array di interi di lunghezza crescente (10, 100, 1000, 10000) generati casualemnte su un intervallo da 0 a 10000

## Caso 10 Elementi
```
Intervallo elementi da 0 a 10000
Il randomArray() 10:           [940, 9354, 9037, 8472, 2390, 9610, 9359, 3863, 1007, 9504]
Il randomArrayAscending() 10:  [940, 1007, 2390, 3863, 8472, 9037, 9354, 9359, 9504, 9610]
Il randomArrayDescending() 10: [9504, 1007, 3863, 9359, 9610, 2390, 8472, 9037, 9354, 940]

TABELLA DEI TEMPI DI INSERTION SORT
Il randomArray() ordinato:           [940, 1007, 2390, 3863, 8472, 9037, 9354, 9359, 9504, 9610]
Il randomArrayAscending() ordinato:  [940, 1007, 2390, 3863, 8472, 9037, 9354, 9359, 9504, 9610]
Il randomArrayDescending() ordinato: [940, 1007, 2390, 3863, 8472, 9037, 9354, 9359, 9504, 9610]
Execution Time di Insertion sort su randomArray():           1089975 ns.
Execution Time di Insertion sort su randomArrayAscending():  3918 ns.
Execution Time di Insertion sort su randomArrayDescending(): 4532 ns.

TABELLA DEI TEMPI DI BUBBLE SORT
Il randomArray() ordinato:           [940, 1007, 2390, 3863, 8472, 9037, 9354, 9359, 9504, 9610]
Il randomArrayAscending() ordinato:  [940, 1007, 2390, 3863, 8472, 9037, 9354, 9359, 9504, 9610]
Il randomArrayDescending() ordinato: [940, 1007, 2390, 3863, 8472, 9037, 9354, 9359, 9504, 9610]
Execution Time di Bubble sort su randomArray():              655794 ns.
Execution Time di Bubble sort su randomArrayAscending():     4258 ns.
Execution Time di Bubble sort su randomArrayDescending():    7248 ns.
```
## Caso 100 Elementi
```
Intervallo elementi da 0 a 10000
Il randomArray() 100:           [2906, ..., 5199]
Il randomArrayAscending() 100:  [241, ..., 9941]
Il randomArrayDescending() 100: [5199, ..., 2906]

TABELLA DEI TEMPI DI INSERTION SORT
Il randomArray() ordinato:           [241, ..., 9941]
Il randomArrayAscending() ordinato:  [241, ..., 9941]
Il randomArrayDescending() ordinato: [241, ..., 9941]
Execution Time di Insertion sort su randomArray():           786695 ns.
Execution Time di Insertion sort su randomArrayAscending():  8776 ns.
Execution Time di Insertion sort su randomArrayDescending(): 78606 ns.

TABELLA DEI TEMPI DI BUBBLE SORT 
Il randomArray() ordinato:           [241, ..., 9941]
Il randomArrayAscending() ordinato:  [241, ..., 9941]
Il randomArrayDescending() ordinato: [241, ..., 9941]
Execution Time di Bubble sort su randomArray():              703961 ns.
Execution Time di Bubble sort su randomArrayAscending():     7340 ns.
Execution Time di Bubble sort su randomArrayDescending():    216395 ns.
```
## Caso 1000 Elementi
```
Intervallo elementi da 0 a 10000
Il randomArray() 1000:           [8605, ..., 7366]
Il randomArrayAscending() 1000:  [9, ..., 9999]
Il randomArrayDescending() 1000: [7366, ..., 8605]

TABELLA DEI TEMPI DI INSERTION SORT
Il randomArray() ordinato:           [9, ..., 9999]
Il randomArrayAscending() ordinato:  [9, ..., 9999]
Il randomArrayDescending() ordinato: [9, ..., 9999]
Execution Time di Insertion sort su randomArray():           5276820 ns.
Execution Time di Insertion sort su randomArrayAscending():  15631 ns.
Execution Time di Insertion sort su randomArrayDescending(): 2960514 ns.

TABELLA DEI TEMPI DI BUBBLE SORT
Il randomArray() ordinato:           [9, ..., 9999]
Il randomArrayAscending() ordinato:  [9, ..., 9999]
Il randomArrayDescending() ordinato: [9, ..., 9999]
Execution Time di Bubble sort su randomArray():              11984810 ns.
Execution Time di Bubble sort su randomArrayAscending():     13465 ns.
Execution Time di Bubble sort su randomArrayDescending():    14922974 ns.
```
## Caso 10000 Elementi
```
Intervallo elementi da 0 a 10000
Il randomArray() 10000:           [52221, ... ]
Il randomArrayAscending() 10000:  [1, ... ]
Il randomArrayDescending() 10000: [14944, ... ]

TABELLA DEI TEMPI DI INSERTION SORT
Il randomArray() ordinato:           [1, … ]
Il randomArrayAscending() ordinato:  [1, ... ]
Il randomArrayDescending() ordinato: [1, … ]
Execution Time di Insertion sort su randomArray():           50798686 ns.
Execution Time di Insertion sort su randomArrayAscending():  120592 ns.
Execution Time di Insertion sort su randomArrayDescending(): 47985447 ns.

TABELLA DEI TEMPI DI BUBBLE SORT
Il randomArray() ordinato:           [1, … ]
Il randomArrayAscending() ordinato:  [1, ... ]
Il randomArrayDescending() ordinato: [1, … ]
Execution Time di Bubble sort su randomArray():              265722228 ns.
Execution Time di Bubble sort su randomArrayAscending():     76343 ns.
Execution Time di Bubble sort su randomArrayDescending():    230632257 ns.
```
## Riassumendo
```
Lunghezza = 10                              INSERTION SORT        BUBBLE SORT
Execution Time su randomArray():            1089975               655794
Execution Time su randomArrayAscending():   3918                  4258 
Execution Time su randomArrayDescending():  4532                  7248

Lunghezza = 100
Execution Time su randomArray():            786695                703961 
Execution Time su randomArrayAscending():   8776                  7340
Execution Time su randomArrayDescending():  78606                 216395

Lunghezza = 1000
Execution Time su randomArray():            5276820               11984810
Execution Time su randomArrayAscending():   15631                 13465 
Execution Time su randomArrayDescending():  2960514               14922974

Lunghezza = 10000
Execution Time su randomArray():            50798686              265722228 
Execution Time su randomArrayAscending():   120592                76343
Execution Time su randomArrayDescending():  47985447              230632257 
```

# Membri del gruppo
I membri partecipanti al lavoro di gruppo sono:  
- [Casagrande Stefano](https://github.com/csgs104)
- [Marchetti Greta](https://github.com/gmarchettiuni)
- [Torrisi Cristian](https://github.com/CristianTorrisi)
- [Cruciata Davide]()



