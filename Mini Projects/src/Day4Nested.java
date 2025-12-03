
//    public class Day4Nested {
//        public static void main(String[] args) {
//            // Family Analogy
//            // i = Father (Runs 2 rounds)
//            // j = Kid (Runs 3 rounds for every 1 round of Father)
//
//            for (int i = 1; i <= 2; i++) {
//                System.out.println("Father starts round: " + i);
//
//                for (int j = 1; j <= 3; j++) {
//                    System.out.println("   Kid runs round: " + j);
//                }
//
//                System.out.println("Father finishes round: " + i);
//                System.out.println("-----------------");
//            }
//        }
//    }
//}

public class Day4Nested {
    public static void main(String[] args) {
        int rows = 3; // Total Rows (Father)
        int cols = 4; // Total Seats per Row (Kid)

        System.out.println("--- Cinema Hall Layout ---");

        // Step 1: Pick a Row (i)
        for (int i = 1; i <= rows; i++) {
            System.out.println("Row" + i);

            // Step 2: Fill all Seats (j) in that Row
            for (int j = 1; j <= cols; j++) {
                System.out.print("[Seat] " + j);// Pakka pakkana print avvali (No 'ln')
            }

            // Step 3: Row Aipoyindi! Go to Next Line.
            System.out.println();
        }
    }
}