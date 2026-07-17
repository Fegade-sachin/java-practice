package java8.stream.type;

import java.util.*;
public class SequentialStreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A", "B", "C", "D");

        names.stream()
                .forEach(System.out::println); // Executes sequentially
    }
}