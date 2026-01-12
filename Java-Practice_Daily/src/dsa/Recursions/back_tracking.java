package dsa.Recursions;

public class back_tracking {
        public static void forward(int n){
            if (n == 0){ // base condition
                return;
            }
            //2.Logic
            System.out.println(n);

            //3. Recursion
            forward(n-1);
        }
        public static void main(String[] args){
            forward(5);
        }
    }