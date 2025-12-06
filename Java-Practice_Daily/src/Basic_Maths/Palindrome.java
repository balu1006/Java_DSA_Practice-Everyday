package Basic_Maths;

class Solution{
    public boolean isPalindrome(int n){
        int reverse = 0;
        int original = n; //copy for comparing original and output values

        while(n > 0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }

        //2. just compare
        if(original == reverse){
            return true;
        } else {
            return false;
        }
    }
}

public class Palindrome {
    public static void main(String[] args){

        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(123));


    }
}
