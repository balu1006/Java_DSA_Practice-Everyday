package OOPs;

class Dads{
    int money = 10000;

    void showMoney(){
        System.out.println("Bank balance:" + money);
    }
}

class son extends Dads{
    int money = 5000;

    void SonMoney(){
        System.out.println("Son's Cash: " + money);       // 5000 (Local/Child)
        System.out.println("Dad's Cash: " + super.money); // 10000 (Parent)

        int totalWealth = money + super.money;
        System.out.println("Total Family Wealth: " + totalWealth);
    }
}



public class Inheritence {
    public static void main(String[] args){

        son arjuna = new son();

        arjuna.showMoney();
        arjuna.SonMoney();

    }
}
