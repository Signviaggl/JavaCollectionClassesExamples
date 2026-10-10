import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void run() {
        System.out.println("SetExample:");
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Alice");

        System.out.println(names);
        System.out.println();
    }
}

