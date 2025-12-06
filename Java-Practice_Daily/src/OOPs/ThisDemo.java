package OOPs;

class Student {
    String name;
    int id;

    /*//  ❌ PROBLEM: Names are same (Shadowing)
    Student(String name, int id ){
        name = name; // Computer thinks: "input name = inpot name" Uselss!
        id = id; // Object variable remain Empty (null/0).
    } */

    // ✅ SOLUTION: Using 'this'
    Student(String name, int id){
        this.name = name; //"Put input 'name' into MY objects 'name' "
        this.id = id; // Put Input "id" into my objects "id'

    }
    void display(){
        System.out.println("Student: "+ name + "| ID: " + id);
    }


}


public class ThisDemo {
    public static void main(String[] args){
        //Creating object
        Student s1 = new Student("Arjuna", 101);
        // If you don't use 'this', output will be: "Student: null | ID: 0"
        // With 'this', output will be: "Student: Arjuna | ID: 101"
        s1.display();
    }

}
