package dsa;

public class RecursionBasics {

    // Method: Print n to 1
    public static void printNumbers(int n) {

        if (n == 0) {  // 1. BASE CASE (The Stop Sign)
            return;
        }
        printNumbers(n - 1);

        System.out.println(n);  // 2. LOGIC (Work)

        // 3. RECURSIVE CALL (Trust the process)
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}