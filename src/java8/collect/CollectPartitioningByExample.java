package java8.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectPartitioningByExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
       Map<Boolean,List<Integer>> partitionByOddEven= numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
       System.out.println(partitionByOddEven);

    }
}
