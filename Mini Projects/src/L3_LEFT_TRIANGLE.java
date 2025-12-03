import java.util.Scanner;

public class L3_LEFT_TRIANGLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ //Row
            for(int j = 1; j <= i; j++){  //column
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}

/*
Pattern left traingle i >n i -> how many stars in that row

 *
 * *
 * * *
 * * * *
 * * * * *

* */