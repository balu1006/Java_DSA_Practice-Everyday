package patterns;
/* Thumb Rule:
0 nundi start chesthe: i < n vadu.
1 nundi start chesthe: i <= n vadu.*/


public class Patter3_1samebut_i {
    public static void main(String[] args){
        int n = 5;
        for (int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}
