package OOPs;

class BankAccount {
    // 1. DATA HIDING (Private)
    // Bayata nundi 'acct.balance' ani access cheyalem.
    private double balance;

    // Constructor to set initial money
    public BankAccount(double initialAmount) {
        if(initialAmount > 0) {
            this.balance = initialAmount;
        }
    }

    // 2. GETTER (View Data)
    // Balance chudodaniki matrame allow chestam.
    public double getBalance() {
        return balance;
    }

    // 3. SETTER (Modify Data with Logic)
    // Direct ga access isthe evadaina negative value pedathadu.
    // Manam "Validation" (Condition) petti update chestam.
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid Amount! ❌");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount myAcct = new BankAccount(1000);

        // myAcct.balance = 500000; // ❌ ERROR! (Private variable visible kadu)

        // Correct Way (Through Method)
        myAcct.deposit(500);

        // Checking Balance
        System.out.println("Current Balance: " + myAcct.getBalance());

        // Trying to cheat
        myAcct.deposit(-1000); // ❌ Logic will stop this.
    }
}