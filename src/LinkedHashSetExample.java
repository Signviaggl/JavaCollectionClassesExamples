import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void run() {
        System.out.println("LinkedHashSetExample:");
        Set<String> names = new LinkedHashSet<>();

        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        System.out.println(names);
        System.out.println();
    }
}

