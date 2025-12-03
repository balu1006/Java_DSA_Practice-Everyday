package Basics;

public class SwapLogic {
    public static void main(String[] args) {
        // Concept: Swapping using a Temp Variable
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a=" + a + ", b=" + b);

        // --- THE LOGIC ---
        int temp = a; // 1. Save 'a' in a safe place (temp)
        a = b;        // 2. Overwrite 'a' with 'b'
        b = temp;     // 3. Put original 'a' (from temp) into 'b'

        System.out.println("After Swap:  a=" + a + ", b=" + b);
    }
}