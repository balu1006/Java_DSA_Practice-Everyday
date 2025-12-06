
package Basic_Maths;
// You are given an integer n. Return the integer formed by placing the "digits" of n in reverse order.

class Solutions{
    public int reverseNumber(int n){
        int reverse = 0;

        while( n > 0){
            //get the last digit
            int digit = n %10;

            //append it to the reversed number
            reverse = reverse*10 + digit;

            //remove the last digit from n
            n = n/10;

        }
        return reverse;
    }
}


public class Reverse_Number {
    public static void main(String[] args){
        Solutions obj = new Solutions();
        int num = 12345;
        System.out.println(obj.reverseNumber(num));

    }
}
