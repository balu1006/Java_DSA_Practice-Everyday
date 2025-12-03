//
//
//public class Day7OOPs {
//
//    static class Car{
//        String brand;
//        int speed;
//
//        void drive(){
//            System.out.println("Driving  " + brand + " " + "at " + speed + "kmph");
//        }
//
//    }
//
//
//
//    public static void main(String[] args){
//
//        Car brand1 = new Car();
//        brand1.brand = "TATA";
//        brand1.speed = 100;
//
//
//        Car brand2 = new Car();
//        brand2.brand = "Mahindra";
//        brand2.speed = 90;
//
//
//        System.out.println("Brand Name : "+ brand1.brand +" Speed : "+ brand1.speed);
//        brand1.drive();
//
//        System.out.println(brand2.brand + " "+ brand2.speed);
//        brand2.drive();
//
//
//    }
//}
//Day8Constructor
public class Day7OOPs {

    static class Car {
        String brand;
        int speed;

        // 1. Constructor (The Setup)
        Car(String b , int s){
            brand = b;
            speed = s;
        }

        void drive() {
            System.out.println("Driving " + brand + " at " + speed + " kmph");
        }
    }

    public static void main(String[] args) {

        // 2. Magic Line (Creation + Assignment in ONE Step)
        Car c1 = new Car("TATA", 100);
        Car c2 = new Car("Mahindra", 90);
        Car c3 = new Car("SUV", 90);

        c1.drive();
        c2.drive();
        c3.drive();
    }
}