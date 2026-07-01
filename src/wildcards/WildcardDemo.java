package wildcards;

import java.util.*;

public class WildcardDemo {

    // Upper Bound (Read)
    public static void display(List<? extends Number> list) {

        System.out.println("Reading Elements:");

        for (Number n : list) {
            System.out.println(n);
        }
    }

    // Lower Bound (Write)
    public static void insert(List<? super Integer> list) {

        list.add(100);
        list.add(200);

        System.out.println("After Adding:");

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3);

        display(intList);

        System.out.println();

        List<Number> numberList = new ArrayList<>();

        insert(numberList);
    }
}
