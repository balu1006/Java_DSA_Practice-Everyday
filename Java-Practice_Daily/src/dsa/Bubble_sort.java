package dsa;
import java.util.Arrays;

public class Bubble_sort {

    // Sorting Method
    public static void arryy(int[] arr) {
        int n = arr.length;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.println("Round " + i + ": " + Arrays.toString(arr));
        }
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        System.out.println("Original: " + Arrays.toString(arr));

        Bubble_sort.arryy(arr);

        System.out.println("Final:    " + Arrays.toString(arr));
    }
}