package org.github.mahambach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testBubbleSortWithUnsortedArray() {
        // Unsortiertes Array erstellen
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};

        // Array sortieren
        BubbleSort.bubbleSort(unsortedArray);

        // Erwartetes sortiertes Array
        int[] expectedArray = {1, 2, 5, 5, 6, 9};

        // Vergleiche das sortierte Array mit dem erwarteten Array
        assertArrayEquals(expectedArray, unsortedArray);
    }

    @Test
    void testBubbleSortWithEmptyArray() {
        // Testen des Bubble-Sort-Algorithmus mit einem leeren Array
        int[] emptyArray = {};

        // Sortiere das leere Array
        BubbleSort.bubbleSort(emptyArray);

        // Erwartetes Array nach der Sortierung
        int[] expectedEmptyArray = {};

        // Überprüfe, ob das leere Array immer noch leer ist
        assertArrayEquals(expectedEmptyArray, emptyArray);
    }

    @Test
    void testBubbleSortWithAlreadySortedArray() {
        // Testen des Bubble-Sort-Algorithmus mit einem bereits sortierten Array
        int[] sortedArray = {1, 2, 3, 4, 5};

        // Sortiere das bereits sortierte Array
        BubbleSort.bubbleSort(sortedArray);

        // Das bereits sortierte Array sollte unverändert bleiben
        assertArrayEquals(sortedArray, sortedArray);
    }
}