package dsa;


public class DSA_Time_and_Space {
    public static void main(String[] args) {
        int n = 5;  //O(1)

        // 1. O(N) - Linear Time (Fast)
        System.out.println("--- O(N) Loop ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Runner " + i);
        }
        // Total Steps: 5

        // 2. O(N^2) - Quadratic Time (Slow)
        System.out.println("\n--- O(N^2) Nested Loop ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Pair: " + i + ", " + j);
            }
        }
        // Total Steps: 5 * 5 = 25 !!
    }
}

/* $O(1)$: Cutting 1 Apple.
(Instant).$O(N)$: Peeling 100 Potatoes. (More potatoes = More time). 1000 = 1000 steps
$O(N^2)$: Matching every spice with every vegetable. (Too much complex work!).*/ // Total Steps: 5 * 5 = 25 !!