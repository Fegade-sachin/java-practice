package java8.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectCountingExample
{
    public static void main(String[] args)
    {
        List<String> cities = Arrays.asList("Mumbai", "Delhi", "Bangalore", "Chennai");
        java.lang.Long count =cities.stream().collect(Collectors.counting());
        System.out.println("Number of cities: " + count);
    }
}
