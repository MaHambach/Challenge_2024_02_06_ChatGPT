package org.github.mahambach;

public class BubbleSort {

    public static void main(String[] args) {
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};

        System.out.println("Unsortiertes Array:");
        printArray(unsortedArray);

        bubbleSort(unsortedArray);

        System.out.println("\nSortiertes Array:");
        printArray(unsortedArray);
    }

    // Methode zur Durchführung des Bubble-Sort-Algorithmus
    public static void bubbleSort(int[] array) {
        int arrayLength = array.length;
        boolean swapped;

        // Solange mindestens ein Element verschoben wurde, weiter sortieren
        do {
            swapped = false;

            // Durchlaufe das Array und vergleiche benachbarte Elemente
            for (int i = 1; i < arrayLength; i++) {
                // Wenn das aktuelle Element größer als das vorherige Element ist, tausche sie
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
            arrayLength--;
        } while (swapped);
    }

    // Methode zum Vertauschen von zwei Elementen im Array
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Methode zum Ausgeben der Array-Elemente
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
