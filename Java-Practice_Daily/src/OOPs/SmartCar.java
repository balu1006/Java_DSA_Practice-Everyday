package OOPs;

class Car {
    // Properties (State)
    String brand;
    int speed;

    // CONSTRUCTOR (The Factory Setup)
    // Same name as Class, No return type
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    // Behavior (Method)
    void drive() {
        System.out.println("Driving " + brand + " at " + speed + " kmph 🚗");
    }
}

public class SmartCar {
    public static void main(String[] args) {
        // Creating Objects using Constructor (One line setup)
        Car c1 = new Car("TATA", 120);
        Car c2 = new Car("Mahindra", 100);

        // Calling methods
        c1.drive();
        c2.drive();
    }
}
