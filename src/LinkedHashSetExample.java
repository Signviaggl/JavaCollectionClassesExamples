import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSetExample - Demonstrates the Set collection using LinkedHashSet
 *
 * What it does:
 * - Shows how to use a LinkedHashSet, which extends HashSet
 * - Like HashSet, it does NOT allow duplicate elements
 * - Unlike HashSet, it MAINTAINS insertion order using internal doubly-linked list
 *
 * Key characteristics of LinkedHashSet:
 * - No duplicates: Each element can appear only once (like HashSet)
 * - Ordered: Elements are stored in the order they were inserted
 * - Slightly slower than HashSet: Due to maintaining insertion order
 *
 * This example adds three names in a specific order:
 * 1. The output will show elements in the same order they were inserted
 * 2. If a duplicate were added, it would not appear in the output
 * 3. Useful when you want a Set's uniqueness property with predictable ordering
 */
public class LinkedHashSetExample {
    public static void run() {
        System.out.println("LinkedHashSetExample:");
        // Create a LinkedHashSet to store String values (no duplicates, maintains insertion order)
        Set<String> names = new LinkedHashSet<>();

        // Add elements in a specific order
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        // Print the set (note: elements appear in insertion order, not alphabetically)
        System.out.println(names);
        System.out.println();
    }
}


