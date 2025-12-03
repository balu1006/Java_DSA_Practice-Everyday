import java.util.Random;
import java.util.Scanner;
 //Number guessing game
public class Guesing_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int RandomNumber = random.nextInt(min, max);

        System.out.println("Number Guessing game ");
        System.out.printf("Guess number between %d-%d\n", min, max);


        do{
            System.out.println("Enter guess Number :");
            guess = sc.nextInt();
            attempts++;

            if(guess >RandomNumber){
                System.out.println("number is high ");

            } else if (guess < RandomNumber) {
                System.out.println("number is low");

            } else {
                System.out.println("You entered correct");
            }

        }while(guess != RandomNumber);
        System.out.println("You won the game");
        System.out.println("How many attempts : "+ attempts++);
    }
}

/* first i taken guess number and how many attempts varaibale guess and attempts
*  int guess, int attempts = 0;
*   i used do while loop for atleast run once
*  inside do i created if else for telling to user low or high number entered
* after do it will go while when user guess is correc t and how many attempts it shows
*
*
*  */


