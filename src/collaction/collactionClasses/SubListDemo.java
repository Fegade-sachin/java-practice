package collaction.collactionClasses;
import java.util.*;

public class SubListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> sub = list.subList(1, 3); // elements at index 1 and 2 → [B, C]

        sub.set(0, "X"); // modifies sublist
        System.out.println(list); // parent list also changes
        System.out.println(sub);
    }
}

