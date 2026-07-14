package java8.collect.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitioningExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        // Partition numbers into even and odd
        Map<Boolean, List<Integer>> partitionedByEvenOdd =
                numbers.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even Numbers: " + partitionedByEvenOdd.get(true));
        System.out.println("Odd Numbers: " + partitionedByEvenOdd.get(false));
    }
}
