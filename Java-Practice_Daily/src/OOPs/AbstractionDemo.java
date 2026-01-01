package OOPs;
//Real Life Logic (The Car Dashboard):
//Nuvvu Car drive chestunnav.
//User Interface: Steering, Accelerator, Brake. (Ivanni neeku kanipistayi).
//Internal Logic: Engine lo Pistons ela kaduluthunnayi? Petrol ela burn avtundi? Wiring ela undi? (Ivanni neeku kanipinchavu).

/*  🧠 CONCEPT 1: ABSTRACT CLASS (The "Incomplete" Parent)
Oka Class mundu abstract ani pedithe... adi "Incomplete Class" ani artham.
Deeniki Object create cheyalem (new Car() ❌).
Deentlo Abstract Methods undochu (Body leni methods).
Rule: Evaraina deenni extends cheskunte, vallu KACHITAMGA aa incomplete methods ni finish cheyali. * */

// ABSTRACT CLASS (Incomplete Plan)
abstract class Vehicle {
    // 1. Concrete Method (Fully working)
    void horn() {
        System.out.println("Pee Pee! 📢");
    }

    // 2. Abstract Method (No Body - Just an Idea)
    // Child class MUST implement this.
    abstract void start();
}

// CHILD CLASS (Must finish the work)
class Cars extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with Key 🔑");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with Kick 🦶");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // ❌ ERROR! Cannot instantiate abstract class.

        Vehicle myCar = new Cars();
        myCar.start(); // Car logic
        myCar.horn();  // Common logic
    }
}