package OOPs;

// 1. PARENT CLASS (Base Class)
class Dad {
    String asset = "Luxury House 🏠";

    void showProperty() {
        System.out.println("Dad owns: " + asset);
    }
}

// 2. CHILD CLASS (Derived Class)
// 'extends' is the magic word
class Son extends Dad {
    String ownAsset = "Sports Bike 🏍️";

    void showMyLife() {
        System.out.println("I have: " + ownAsset);
        // Magic: I can access Dad's asset directly!
        System.out.println("I inherited: " + asset);
    }
}

public class INHERITANCE {
    public static void main(String[] args) {
        Son arjuna = new Son();

        // Son can call his own method
        arjuna.showMyLife();

        // Son can ALSO call Dad's method! (Code Reusability)
        arjuna.showProperty();
    }
}