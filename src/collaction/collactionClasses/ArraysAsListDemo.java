package collaction.collactionClasses;

import java.util.*;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        List<String> fixedList = Arrays.asList("A", "B", "C");

        fixedList.set(1, "X");   //  allowed (replace)
        System.out.println(fixedList);

        fixedList.add("Y");      //  UnsupportedOperationException
    }
}
