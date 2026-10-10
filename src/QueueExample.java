import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void run() {
        System.out.println("QueueExample:");
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println();
    }
}

