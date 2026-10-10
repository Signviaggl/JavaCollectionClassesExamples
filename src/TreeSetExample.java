import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void run() {
        System.out.println("TreeSetExample:");
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(3);
        numbers.add(7);

        System.out.println(numbers);
        System.out.println();
    }
}

