import java.util.Scanner;

public class L2_Hallow_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ //Row
            for(int j = 1; j <= n; j++){  //column

                if(i ==1 || i == n || j == 1|| j==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


    }
}
/*
i == 1  (top row)
i == n  (bottom row)
j == 1  (left border)
j == n  (right border)

*****
*   *
*   *
*****

*/