import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rectangular {
    public static void main(String[] args) {

        // height * with = area

        double height;
        double width;
        double area;

        Scanner sc = new Scanner(System.in); // Scanner object crewated

        System.out.println("Enter height: ");
        height = sc.nextDouble();

        System.out.println("enter width: ");
        width = sc.nextDouble();

        area = height* width;

        System.out.printf("the area: " + area + "cm2");
    }
}