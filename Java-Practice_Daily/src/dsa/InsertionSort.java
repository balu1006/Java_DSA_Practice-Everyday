package dsa;
import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {
        int n = arr.length;

        // 1. Start from 2nd card (Index 1)
        for (int i = 1; i < n; i++) {

            int currentCard = arr[i]; // Right hand lo card we taken
            int j = i - 1; // Left side (Sorted part) lo last card index

            // 2. Compare backward and SHIFT
            // Condition: j >= 0  AND arr[j] > new card
            while (j >= 0 && arr[j] > currentCard) {
                arr[j + 1] = arr[j]; // Pedda card ni right ki jarupu (Shift)
                j--; // Inka left ki velli check cheyi
            }

            // 3. INSERT the card
            // Jaruputhu vellaka oka empty spot vastundi (j+1), akkada card pettu.
            arr[j + 1] = currentCard;

            // Debugging (Observe how left side gets sorted step by step)
            System.out.println("After picking " + currentCard + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Original: " + Arrays.toString(arr));

        sort(arr);

        System.out.println("Final:    " + Arrays.toString(arr));
    }
}