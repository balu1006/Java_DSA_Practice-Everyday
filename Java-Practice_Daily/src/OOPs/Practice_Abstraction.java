package OOPs;

import org.w3c.dom.ls.LSOutput;

interface Payment {
    void pay(int amout);
}

class UPI implements Payment {
    @Override
    public void pay(int amout) {
        System.out.println("Paid [amount] via GPay" + amout);
    }


}

class CreditCard implements Payment{
    @Override
    public void pay(int amout) {
        System.out.println( "Paid [amount] via Card" + amout + ".");
    }
}
public class Practice_Abstraction {
    public static void main(String[] args){
        Payment P = new UPI();
        Payment C = new CreditCard();
        C.pay(500);
        P.pay(600);

    }


}
