import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
//        System.out.println("Prime Numbers between 1 and 50:");
//
//        // OUTER LOOP: Picks numbers one by one (The Conveyor Belt)
//        // 2, 3, 4, 5 ... up to 50
//        for (int number = 2; number <= 100; number++) {
//
//            boolean isPrime = true; // Assume it is VIP first
//
//            // INNER LOOP: The Inspector (Checks for factors)
//            // Checks if 'number' is divisible by anyone other than 1 and itself
//            for (int i = 2; i * i <= number; i++) {
//                if (number % i == 0) {
//                    isPrime = false; // Caught! Has factors. Not Prime.
//                    break; // Stop checking this number
//                }
//            }
//
//            // FINAL STAMP: If still prime, print it
//            if (isPrime == true) {
//                System.out.print(number + " ");
//            }
//

                Scanner sc = new Scanner(System.in); // 2. Scanner Create Cheyali

                System.out.println("Enter the limit (N): ");
                int n = sc.nextInt(); // 3. User ichina number ni 'n' lo store chestam

                System.out.println("Prime Numbers up to " + n + ":");

                // OUTER LOOP: Instead of 50, we use 'n'
                for (int number = 2; number <= n; number++) {

                    boolean isPrime = true;

                    // INNER LOOP: Inspector Logic
                    for (int i = 2; i * i <= number; i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    // FINAL STAMP
                    if (isPrime == true) {
                        System.out.print(number + " ");
                    }
                }
            }
        }