import java.util.ArrayDeque;
import java.util.Deque;

/**
 * DequeExample - Demonstrates the Deque (Double-Ended Queue) collection interface
 *
 * What it does:
 * - Shows how to use a Deque, which allows insertion and removal from BOTH ends
 * - "Deque" stands for "Double-Ended Queue"
 * - ArrayDeque is used here as the implementation (more efficient than LinkedList for Deque)
 *
 * Key characteristics of Deques:
 * - Bidirectional: Can add and remove from both front and back
 * - Flexible: Can be used as both a Queue (FIFO) and a Stack (LIFO)
 * - Real-world analogy: Like a line where people can join/leave from either end
 * - Operations:
 *   - addFirst() / addLast(): Add to front or back
 *   - removeFirst() / removeLast(): Remove from front or back
 *   - getFirst() / getLast(): View without removing
 *
 * This example demonstrates:
 * 1. Adding an element to the front using addFirst()
 * 2. Adding an element to the back using addLast()
 * 3. Printing the deque with both elements
 * 4. Removing from front and back using removeFirst() and removeLast()
 */
public class DequeExample {
    public static void run() {
        System.out.println("DequeExample:");
        // Create a Deque using ArrayDeque (allows operations from both ends)
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to different ends
        deque.addFirst("front");   // Add to the front/beginning
        deque.addLast("back");     // Add to the back/end

        // Print the entire deque
        System.out.println(deque);
        // Remove from the front
        System.out.println(deque.removeFirst());
        // Remove from the back
        System.out.println(deque.removeLast());
        System.out.println();
    }
}

