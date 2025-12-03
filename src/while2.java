import java.util.Scanner;

public class while2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        String name ="";

        while (name.isEmpty()){
            System.out.println("Enter your name: ");
            name = sc.nextLine();

        }
        System.out.println("Hello " + name);

        sc.close();
    }
}
