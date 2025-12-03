package Basics;


public class BouncerLogic {
    public static void main(String[] args) {
        // Concept: Decision Making & Modulo Operator

        int age = 17;
        int number = 10;

        // 1. IF-ELSE (Traffic Police)
        if (age >= 18) {
            System.out.println("Welcome to the Party! 🎉");
        } else {
            System.out.println("Sorry, go home and study! 📚");
        }

        // 2. MODULO LOGIC (Even or Odd)
        // % gives remainder. If remainder is 0, it is Even.
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}