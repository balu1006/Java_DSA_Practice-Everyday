package patterns;



class Solution2{
    public void Pattern2(int n){
        for (int i = 0; i <n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println( " ");
        }

    }
}

public class Pattern2_Right_Angled_Triangle {
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        int n = 5;
        sol.Pattern2(n);
    }
}