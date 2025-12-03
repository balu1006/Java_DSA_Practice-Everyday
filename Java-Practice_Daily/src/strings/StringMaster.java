package strings;

public class StringMaster {
    public static void main(String[] args) {
        String name = "Arjuna";

        // 1. Basic Operations
        System.out.println("Original: " + name);
        System.out.println("Length: " + name.length()); // Method call ()
        System.out.println("Uppercase: " + name.toUpperCase());

        // 2. Equality Check (Important!)
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // NEVER use == for strings (Checks Address)
        // ALWAYS use .equals() (Checks Content)
        if (s1.equals(s2)) {
            System.out.println("Strings are Equal ✅");
        } else {
            System.out.println("Strings are Different ❌");
        }

        // 3. REVERSE LOGIC (Interview Question)
        System.out.print("Reversed: ");
        // Logic: Start form Last Index (length-1), go to 0, decrement i
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println(); // Just new line
    }
}