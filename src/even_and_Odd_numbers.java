import java.util.Scanner;

public class even_and_Odd_numbers {
    public static void main(String[] args){
        //Create scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i+= 2) {
            System.out.print(i + " ");
        }


    }
}
