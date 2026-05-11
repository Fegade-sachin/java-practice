package collaction;

import java.util.*;

public class IndexShiftTrap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("B")) {
                list.remove(i); //  shifts elements left
            }
        }
        System.out.println(list);
    }
}
