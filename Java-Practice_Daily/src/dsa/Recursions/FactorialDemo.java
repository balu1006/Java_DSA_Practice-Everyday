package dsa.Recursions;

public class FactorialDemo {

    // Method returns 'int' (Answer)
    public static int factorial(int n) {

        // 1. BASE CASE
        // 1  stop. Return 1.
        if (n == 1) {
            return 1;
        }

        // 2. RECURSIVE STEP
        // youre work  = n * (call others)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}

/*🧠 TRACE (Cinema Script)
fact(5) call aindi:
5 * fact(4)? (Wait...)
4 * fact(3)? (Wait...)
3 * fact(2)? (Wait...)
2 * fact(1)? (Wait...)
fact(1) returns 1. (Base Case Hit!).
Return Journey (Calculations):
2 * 1 = 2. (Returns to step 3).
3 * 2 = 6. (Returns to step 2).
4 * 6 = 24. (Returns to step 1).
5 * 24 = 120. (Final Answer!).
*/