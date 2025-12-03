import java.util.Scanner;

public class L1_Pattern {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ //Row
            for(int j = 1; j <= n; j++){  //column
                System.out.print("* ");
            }
            System.out.println();
        }


        /* n*n grid row and column
         *****
         *****
         *****
         *****
         *****
         */



    }
}
