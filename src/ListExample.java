import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void run() {
        System.out.println("ListExample:");
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println(fruits.get(1));
        System.out.println();
    }
}

