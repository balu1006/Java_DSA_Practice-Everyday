package methods;


public class MethodTypes {

    // Type 1: VOID Method (Does work, Returns nothing)
    public static void sayHello(String name) {
        System.out.println("Hello " + name + "! Welcome back.");
    }

    // Type 2: RETURN Method (Does work, Gives back result)
    // Analogy: Juice shop gives juice in exchange for money.
    public static boolean isEven(int number) {
        // Pro Tip: Direct return without if-else
        return (number % 2 == 0);
    }

    // MAIN METHOD (The Boss)
    public static void main(String[] args) {
        // Calling Void Method
        sayHello("Arjuna");

        // Calling Return Method (We must store or print the result)
        boolean result = isEven(10);

        if (result == true) { // or just 'if(result)'
            System.out.println("10 is an Even number.");
        } else {
            System.out.println("10 is an Odd number.");
        }
    }
}
