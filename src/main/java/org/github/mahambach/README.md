# Bubble Sort Programm

Dieses Programm implementiert den Bubble-Sort-Algorithmus zur Sortierung eines Integer-Arrays.

## Funktionalität

Das Programm besteht aus folgenden Hauptteilen:

- Die Klasse `BubbleSort`, die die Implementierung des Bubble-Sort-Algorithmus enthält.
- Die `main`-Methode in der Klasse `BubbleSortTest`, die JUnit 5 (Jupiter) Tests für die `bubbleSort`-Methode enthält.
- Die `bubbleSort`-Methode, die das übergebene Array mit dem Bubble-Sort-Algorithmus sortiert.

## Verwendung

1. **Unsortiertes Array erstellen**: Ein unsortiertes Integer-Array wird erstellt.
2. **Array sortieren**: Die Methode `bubbleSort` wird aufgerufen, um das unsortierte Array zu sortieren.
3. **Sortiertes Array anzeigen**: Das sortierte Array wird ausgegeben.

## JUnit 5 Tests

Das Programm enthält JUnit 5 (Jupiter) Tests, um die Funktionalität der `bubbleSort`-Methode sicherzustellen. Die Tests überprüfen:

1. Die Sortierung eines unsortierten Arrays.
2. Das Verhalten der Methode bei einem leeren Array.
3. Die Unveränderlichkeit eines bereits sortierten Arrays.

## Beispiel

Ein Beispiel für die Verwendung des Programms:

```java
public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};

        System.out.println("Unsortiertes Array:");
        printArray(unsortedArray);

        BubbleSort.bubbleSort(unsortedArray);

        System.out.println("\nSortiertes Array:");
        printArray(unsortedArray);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
