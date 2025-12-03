package arrays;

public class CinemaHall {

    // Method to build a matrix (2D Layout)
    public static void buildHall(int rows, int cols) {
        System.out.println("\n--- Building Hall (" + rows + "x" + cols + ") ---");

        // Outer Loop: Controls ROW (The Father)
        for (int i = 1; i <= rows; i++) {
            System.out.print("Row " + i + ": ");

            // Inner Loop: Controls SEATS/COLS (The Kid)
            // Logic: Kid runs full cycle (1 to cols) for every 1 step of Father
            for (int j = 1; j <= cols; j++) {
                System.out.print("[Seat " + j + "] ");
            }

            // Enter Key: Move to next line after row finishes
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Reusing the logic for different sizes
        buildHall(2, 3); // Small Hall
        buildHall(3, 4); // Big Hall
    }
}
