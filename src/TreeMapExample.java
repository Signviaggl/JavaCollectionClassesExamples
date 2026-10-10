import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void run() {
        System.out.println("TreeMapExample:");
        Map<String, Integer> scores = new TreeMap<>();

        scores.put("Charlie", 90);
        scores.put("Alice", 80);
        scores.put("Bob", 85);

        System.out.println(scores);
        System.out.println();
    }
}

