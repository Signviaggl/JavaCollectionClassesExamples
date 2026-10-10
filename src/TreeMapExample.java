import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMapExample - Demonstrates the Map collection interface using TreeMap
 * 
 * What it does:
 * - Shows how to use a TreeMap, which is a sorted Map implementation
 * - Stores key-value pairs in sorted order based on keys
 * - Like HashMap, each key can appear only once
 * - Backed by a Red-Black tree data structure
 * 
 * Key characteristics of TreeMaps:
 * - Sorted keys: Keys are automatically stored in sorted order
 * - Natural ordering: By default, sorts keys in ascending order (or by custom comparator)
 * - Performance: O(log n) for basic operations (slower than HashMap but ordered)
 * - Range operations: Supports efficient range queries by key
 * - Unique keys: Each key maps to only one value
 * 
 * This example demonstrates:
 * 1. Adding key-value pairs in random order
 * 2. The map automatically sorts entries by their keys alphabetically
 * 3. Retrieving and printing the sorted map
 */
public class TreeMapExample {
    public static void run() {
        System.out.println("TreeMapExample:");
        // Create a TreeMap with String keys and Integer values (automatically sorted by keys)
        Map<String, Integer> scores = new TreeMap<>();

        // Add key-value pairs in random order
        scores.put("Charlie", 90);
        scores.put("Alice", 80);
        scores.put("Bob", 85);

        // Print the map (note: entries are sorted alphabetically by key: Alice, Bob, Charlie)
        System.out.println(scores);
        System.out.println();
    }
}

