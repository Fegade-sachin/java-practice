package wildcards;

import java.util.*;

public class UpperBoundDemo {

    public static void printNumbers(List<? extends Number> list) {

        for (Number n : list) {
            System.out.println(n);
        }

        // list.add(100);      // Compile-time Error
        // list.add(10.5);     // Compile-time Error
        // list.add(new Integer(5)); // Compile-time Error
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);
    System.out.println("___________________________________________________________");
        printNumbers(intList);
        System.out.println("__________________________________________________________\n");
        printNumbers(doubleList);
    }
}