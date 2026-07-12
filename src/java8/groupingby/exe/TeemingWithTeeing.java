package java8.groupingby.exe;

import java.util.List;
import java.util.stream.Collectors;

public class TeemingWithTeeing
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        java.lang.Double averageOfMaxAndMin  =numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.minBy(Integer::compare),
                        Collectors.maxBy(Integer::compare),
                        (min,max)->(min.get()+max.get())/2.0));
                System.out.println( averageOfMaxAndMin);
    }
}
