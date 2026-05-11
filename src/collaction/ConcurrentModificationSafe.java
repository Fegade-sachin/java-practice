package collaction;

import java.util.*;

public class ConcurrentModificationSafe {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("B")) {
                itr.remove(); //  safe removal
            }
        }
        System.out.println(list);
    }
}
