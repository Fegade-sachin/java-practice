package java8.collect.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        // Partition numbers into even and odd, then count the occurrences
        Map<Boolean, Long> countByEvenOdd =
                numbers.stream()
                        .collect(Collectors.partitioningBy(
                                n -> n % 2 == 0,
                                Collectors.counting()
                        ));

        System.out.println("Count of Even Numbers: " + countByEvenOdd.get(true));
        System.out.println("Count of Odd Numbers: " + countByEvenOdd.get(false));
    }
}