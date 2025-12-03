 public class Day5Methods {

        // 1. Method to Add (Returns answer)
        // Waiter: "Money teeskoni, Bill teeskoni ra"
        public static int add(int a, int b) {
            return a + b;
        }

        // 2. Method to Greet (Returns nothing - VOID)
        // Waiter: "Velli aa customer ki Hi cheppu" (Anthe, em tevaldu)
        public static void sayHello(String name) {
            System.out.println("Hello " + name + "! Welcome to Calculator.");
        }


        //3. Nested loop
     public static void movieHall(int rows, int columns){
         System.out.println("--- Building Hall of size " + rows + "x" + columns + " ---");

            for(int i = 0; i <=rows; i++){
                System.out.print("Row " + i + ": ");
                for(int j = 0; j<= columns; j++){
                    System.out.print("[Seat " + j + "] ");

                }
                System.out.println();
            }

     }

     //4. Method coffee
     public static boolean isEven(int number) {
         if (number % 2 == 0) {
             return true;  // Small 't'
         } else {
             return false; // Small 'f'
         }
     }

     // 5. Strings
     public static void strings(String names){
            for(int i =names.length()- 1; i >= 0; i-- ){
                System.out.print(names.charAt(i));
            }
     }


        // --- MAIN (The Boss) ---
        public static void main(String[] args) {

            // Calling Method 2
            sayHello("Arjuna");

            //Calling method 5 strings
            strings("Arjuna");


//            var odd = isEven(5);
//            boolean even = isEven(6);
//            System.out.println("Is 2 Even? : " + isEven(8));

//            int x = 10;
//            int y = 5;
//
//            // Calling Method 1
//            int result = add(x, y); // Boss orders, Method executes
//
//            System.out.println("Sum is: " + result);
//
//            // Reusability Magic: Malli vadukovachu vere numbers tho
//            System.out.println("Another Sum: " + add(100, 200));
//            movieHall(5,5);


        }
    }
