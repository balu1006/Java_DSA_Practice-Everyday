import java.util.Scanner;

public class HcfLcmMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number (a):");
        int a = sc.nextInt(); // Ex: 12
        int originalA = a;    // Backup for LCM formula

        System.out.println("Enter Second Number (b):");
        int b = sc.nextInt(); // Ex: 18
        int originalB = b;    // Backup for LCM formula

        // --- HCF LOGIC (Smart Way) ---
        while (b != 0) {
            int temp = b;     // 1. Backup old 'b' (Divisor)
            b = a % b;        // 2. Calculate Remainder (New 'b')
            a = temp;         // 3. Assign old Divisor to Dividend (New 'a')
        }
        // Loop ends when Remainder (b) is 0.
        // The final Divisor is sitting in 'a'.

        int hcf = a;
        System.out.println("HCF (GCD) is: " + hcf);

        // --- LCM LOGIC (Shortcut Formula) ---
        // LCM * HCF = a * b
        int lcm = (originalA * originalB) / hcf;

        System.out.println("LCM is: " + lcm);
    }
}