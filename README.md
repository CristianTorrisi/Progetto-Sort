# Progetto di Laboratorio
![image](https://github.com/CristianTorrisi/Progetto-Sort/assets/146428019/c9232478-220d-463a-9ce5-99cb3b9bd84e)
# Indice
- [Insert Sort](#Insert-Sort)
- [Bubble Sort](#Bubble-Sort)
- [Timer e Generator](#Time-e-Generator)
- [Membri gruppo](#Membri-del-gruppo)



# Insert Sort 
Dato come parametro l'array di interi generati casualmente,implento l'algoritmo di ordinamento Insert Sort che mi restituisce un array di numeri interi casuali ordinato. 

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
Il  caso ottimo  per l'algoritmo è quello in cui la sequenza di partenza sia già ordinata. In questo caso, l'algoritmo ha tempo di esecuzione lineare, ossia 
O(n).

Il caso pessimo è invece quello in cui la sequenza di partenza sia ordinata al contrario. In questo caso, ogni iterazione dovrà scorrere e spostare ogni elemento della sottosequenza ordinata prima di poter inserire il primo elemento della sottosequenza non ordinata. 

Pertanto, in questo caso l'algoritmo di insertion sort ha complessità temporale quadratica, ossia O(n^2)


# Bubble Sort 
Dato come parametro l'array di interi generati casualmente,implento l'algoritmo di ordinamento Bubble Sort che mi restituisce un array di numeri interi casuali ordinato. 

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
public static long measureExecutionTime(Runnable method) {
        long startTime = System.nanoTime();
        method.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
```
# Membri del gruppo
I membri partecipanti al lavoro di gruppo sono:  
- [Casagrande Stefano](https://github.com/csgs104)
- [Marchetti Greta](https://github.com/gmarchettiuni)
- [Torrisi Cristian](https://github.com/CristianTorrisi)
- [Cruciata Davide]()



