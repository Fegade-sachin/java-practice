package collaction.collactionClasses;

import java.util.*;

public class SubListTrap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        List<String> sub = list.subList(1, 3); // [B, C]

        list.add("E"); //  structural change in parent
        System.out.println(list);// Run normal
        System.out.println(sub); //  ConcurrentModificationException
    }
}
