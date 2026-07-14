package java8.collect.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class  PartitionNumbersEvenOddAndFindMix
{
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        // Partition numbers into even and odd, then find the maximum value in each partition
        Map<Boolean, Optional<Integer>> maxByEvenOdd =
                numbers.stream()
                        .collect(Collectors.partitioningBy(
                                n -> n % 2 == 0,
                                Collectors.maxBy(Integer::compareTo)
                        ));

        System.out.println("Maximum Even Number: " + maxByEvenOdd.get(true).orElse(null));
        System.out.println("Maximum Odd Number: " + maxByEvenOdd.get(false).orElse(null));
    }
}