import java.util.ArrayList;
import java.util.List;

/**
 * ListExample - Demonstrates the List collection interface
 *
 * What it does:
 * - Shows how to use an ArrayList, which is a resizable array implementation
 * - ArrayList allows duplicate elements and maintains insertion order
 * - Elements can be accessed by their index (position)
 *
 * Key characteristics of Lists:
 * - Ordered: Elements are stored in a specific order
 * - Duplicates allowed: Can store multiple identical values
 * - Index-based access: Can retrieve elements by their position
 *
 * This example adds three fruits (including a duplicate "Apple") and demonstrates:
 * 1. Adding elements to the list
 * 2. Printing the entire list
 * 3. Accessing a specific element by index (get method)
 */
public class ListExample {
    public static void run() {
        System.out.println("ListExample:");
        // Create a List to store String values
        List<String> fruits = new ArrayList<>();

        // Add elements to the list (note: "Apple" is added twice)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        // Print the entire list (note the duplicate "Apple")
        System.out.println(fruits);
        // Access the element at index 1 (which is "Banana")
        System.out.println(fruits.get(1));
        System.out.println();
    }
}



