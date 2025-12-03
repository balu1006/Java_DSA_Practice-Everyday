import javax.swing.*;
import java.util.Scanner;

//public class Print_Numbers {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any Number:");
//        int n = sc.nextInt();
//
//        for(int i = 1; i <= n; i++){
//            System.out.println(i + "");
//
//        }
//
//
//    }
//}

//for ( start ; condition ; step )  user enter 5 step is i++ increment to <= i i is 1
//{

public class Print_Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //Scanner object created

        System.out.println("enter number:" );
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.println(i+ "");
        }


    }
}