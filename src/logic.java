import java.util.Scanner;

public class logic {
    public static void main(String[] args){
       /**
        // && || !
        double temp = 35;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is Good");
            System.out.println("it is sunny outside");
        }
        else if(temp <=30 && temp >= 0 && !isSunny){
            System.out.println("The weather id Good");
            System.out.println("it is cloudy outside");
        }
        else if( temp > 30 || temp <0){
            System.out.println("The weather is bad");
        }
        **/
        Scanner sc = new Scanner(System.in);

        String username;

        System.out.print("Enter your new username: ");
        username = sc.nextLine();

        if(username.length()<4 || username.length() > 12){
            System.out.println("user name must be 4-12 Characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("username must not contain spaces or underscore");
            
        } else{
            System.out.println("Welcome " + username);
        }
        sc.close();

    }


}
