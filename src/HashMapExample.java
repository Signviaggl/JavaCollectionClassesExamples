import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void run() {
        System.out.println("HashMapExample:");
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Alice", 31);

        System.out.println(ages);
        System.out.println(ages.get("Bob"));
        System.out.println();
    }
}

