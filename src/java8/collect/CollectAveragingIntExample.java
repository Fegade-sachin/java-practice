package java8.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAveragingIntExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Double average =numbers.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println(average);

    }
}
