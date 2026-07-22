package collaction.collactionClasses;

import java.util.*;

public class NewArrayListDemo {
    public static void main(String[] args) {
        List<String> resizableList = new ArrayList<>(Arrays.asList("A", "B", "C"));

        resizableList.set(1, "X");   //  replace
        resizableList.add("Y");      // add new element
        resizableList.remove("A");   //  remove element
        System.out.println(resizableList);
    }
}
