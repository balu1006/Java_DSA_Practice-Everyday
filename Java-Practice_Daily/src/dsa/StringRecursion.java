package dsa;

public class StringRecursion {
    public static void reversePrint(String str, int index){
        //1. Base
        if (index == str.length()){
            return;
        }
        // 2. RECURSIVE CALL (Vellipo - Don't print yet)
        reversePrint(str, index+1);

        //3 Logic (Tirigi vachaka print cheyi)
        System.out.println(str.charAt(index));
    }

public static void main(String[] args) {
    String s = "Arjuna";
    System.out.print("Reverse: ");
    reversePrint(s, 0); // Start from 0th index
}
}
