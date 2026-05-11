package collaction;

import java.util.*;

public class ConcurrentModificationEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s); //  modifies list directly
            }
        }
    }
}
