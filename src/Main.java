/**
 * Main class - Entry point for Java Collection Classes Examples
 * 
 * This class demonstrates various collection types available in the Java Collections Framework:
 * - Lists: Ordered collections that allow duplicates
 * - Sets: Unordered collections that don't allow duplicates
 * - Queues: Collections designed for element removal in a specific order
 * - Deques: Double-ended queues allowing insertion/removal from both ends
 * - Maps: Key-value pair collections
 * 
 * Each example shows how to create, add elements, and retrieve data from different collection types.
 */
public class Main {
    public static void main(String[] args) {
        // Running all collection examples in sequence
        ListExample.run();
        SetExample.run();
        LinkedHashSetExample.run();
        TreeSetExample.run();
        QueueExample.run();
        DequeExample.run();
        HashMapExample.run();
        TreeMapExample.run();
    }
}