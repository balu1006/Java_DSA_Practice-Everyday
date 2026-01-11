package arrays;

public class LargestElement {

    // Method to find logic
    public static int findMax(int[] arr) {
        // Edge Case: Array kali ga unte?
        if (arr.length == 0) return -1;

        // 1. Assume First guy is Max
        int max = arr[0];

        // 2. Loop through the rest (Start from index 1)
        for (int i = 1; i < arr.length; i++) {

            // 3. Challenge
            if (arr[i] > max) {
                max = arr[i]; // Update the King
            }
        }

        // 4. Return the Final King
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 2, 90, 34};

        System.out.println("Thinking...");
        int king = findMax(numbers);

        System.out.println("The Largest Element is: " + king);
    }
}