import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Highiest Number:");
        int a = sc.nextInt();

        System.out.println("Enter lowest number");
        int b = sc.nextInt();
// SMART WAY: Euclidean Algorithm (Modulo Version)
        while (b != 0){
            int temp = b;
            b = a%b;
            a = temp;

        }
        System.out.println("HCF is :" + a);
    }
}
