package dsa;

import java.util.ArrayList; // Import is must

public class DynamicArray {
    public static void main(String[] args) {
        // 1. Create Magic Bag (For Strings)
        ArrayList<String> cart = new ArrayList<>();

        // 2. Add Items (Size increases automatically)
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("HDMI Cable");

        System.out.println("Cart: " + cart); // Direct print possible! (No loop needed)
        System.out.println("Total Items: " + cart.size());

        // 3. Access Item (Like arr[1])
        String item = cart.get(1);
        System.out.println("Second Item: " + item);

        // 4. Remove Item (Delete Logic)
        cart.remove(2); // Removes "Keyboard"
        System.out.println("After Deleting Keyboard: " + cart);

        // 5. Add at specific place
        cart.add(0, "MacBook Pro"); // Pushing "Laptop" to index 1
        System.out.println("Updated Cart: " + cart);
    }
}