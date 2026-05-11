package collaction;

import java.util.*;

public class NullListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("A");
        list.add(null);
        list.add("B");

        System.out.println(list);
        list.remove(null);
        System.out.println(list);// removes first occurrence of null
    }
}
