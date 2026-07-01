package wildcards;

import java.util.*;

public class LowerBoundDemo {

    public static void addNumbers(List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);

        for (Object obj : list) {
            System.out.println(obj);
        }
        Object obj = list.get(0);      // allow
        System.out.println(obj);//only obj allow


// Integer i = list.get(0);    // ❌ Compile-time Error
    }

    public static void main(String[] args) {

        List<Number> numberList = new ArrayList<>();

        addNumbers(numberList);

    }
}
