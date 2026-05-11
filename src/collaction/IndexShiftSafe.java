package collaction;

import java.util.*;

public class IndexShiftSafe {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals("B")) {
                itr.remove(); //  safe
            }
        }
        System.out.println(list);
    }
}
