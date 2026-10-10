import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void run() {
        System.out.println("DequeExample:");
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("front");
        deque.addLast("back");

        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println();
    }
}

