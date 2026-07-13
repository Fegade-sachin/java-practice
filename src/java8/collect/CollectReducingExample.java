package java8.collect;

import java.util.Arrays;
import java.util.List;

public class CollectReducingExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);


    }
}
