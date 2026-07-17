package java8.stream.type;

import java.util.stream.*;

public class InfiniteStreamDemo {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);
    }
}