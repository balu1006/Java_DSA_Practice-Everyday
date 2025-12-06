package OOPs;

class Parent{
    void property(){
        System.out.println("Take my house and cash 🏠🏘️💰");
    }
    void marry(){
        System.out.println("Marry Subbalakshmi (Arranged) 💍");
    }

}

class Kid extends Parent{
    //@Overriding// OVERRIDING: Changing Parent's definition
    //    @Override // Idi Good Practice (Compiler ki cheppadam)

    @Override
     void marry(){
        System.out.println("No! I will marry Trisha (Love) ❤️");
    }

}

public class PolymorphismDemo {
    public static void main(String[] args){
        Kid k = new Kid();
        k.property();
        k.marry();

    }
}
