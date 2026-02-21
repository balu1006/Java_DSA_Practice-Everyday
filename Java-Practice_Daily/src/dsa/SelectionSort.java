package dsa;
import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // 1. OUTER LOOP (The PT Master)
        // Veedu prathi seat daggarki veltadu. (0 to n-2)
        // Last seat daka vellalsina pani ledu, endukante last vadu automatic ga migilipothadu.
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i; // Assume Current Seat guy is Minimum first.

            // 2. INNER LOOP (The Searching Eyes)
            // Veedu 'i+1' nundi last daka vethiki, Nijamaina Minimum evaro cheptadu.
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Kotha Minimum dorikadu! Index note chesko.
                }
            }

            // 3. THE SWAP (Kurchi Marchadam)
            // Minimum dorikina index lo unna value ni, Current 'i' lo unna value ni marchu.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // (Optional: Prathi round ki em jaruguthundo chuddam)
            System.out.println("Round " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Original: " + Arrays.toString(arr));

        sort(arr);

        System.out.println("Final:    " + Arrays.toString(arr));
    }
}