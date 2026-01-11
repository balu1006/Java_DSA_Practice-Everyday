package patterns;

public class Pattern3_Right_anagle_number {
    public static void main(String[] args){
        int N =5;
        for (int i = 1; i <= N; i++) {
            // Inner loop for columns
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next row
            System.out.println();
        }
    }
}
