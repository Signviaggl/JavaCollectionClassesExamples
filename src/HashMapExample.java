import java.util.HashMap;
import java.util.Map;

/**
 * HashMapExample - Demonstrates the Map collection interface using HashMap
 *
 * What it does:
 * - Shows how to use a HashMap, which stores key-value pairs
 * - HashMap does NOT guarantee any particular order
 * - Each key can appear only once (keys are unique), but values can be duplicated
 * - If a duplicate key is added, its value is overwritten
 *
 * Key characteristics of HashMaps:
 * - Key-value pairs: Stores associations between keys and values
 * - Fast lookup: O(1) average time to retrieve a value by key
 * - Unordered: Entries are not stored in any particular order
 * - Unique keys: Each key can map to only one value
 *
 * This example demonstrates:
 * 1. Adding key-value pairs (name -> age)
 * 2. Attempting to add "Alice" twice - only the most recent value (31) is kept
 * 3. Retrieving a value by key using get()
 * 4. Printing the entire map
 */
public class HashMapExample {
    public static void run() {
        System.out.println("HashMapExample:");
        // Create a HashMap with String keys and Integer values
        Map<String, Integer> ages = new HashMap<>();

        // Add key-value pairs
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        // Re-adding "Alice" with a different value - this updates the value to 31
        ages.put("Alice", 31);

        // Print the entire map (note: order may vary, and Alice's age is 31)
        System.out.println(ages);
        // Retrieve the value associated with "Bob" key
        System.out.println(ages.get("Bob"));
        System.out.println();
    }
}

