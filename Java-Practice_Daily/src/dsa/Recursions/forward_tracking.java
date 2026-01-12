package dsa.Recursions;

public class forward_tracking {
    public static void forward(int n){
        if (n == 0){ // base condition
            return;
        }
        //3. Recursion
        forward(n-1);

        //2.Logic
        System.out.println(n);
    }
    public static void main(String[] args){
        forward(5);
    }
}
