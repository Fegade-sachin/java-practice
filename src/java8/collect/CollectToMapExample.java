package java8.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMapExample
{
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Delhi", "Bangalore");
        java.util.Map<String,Integer>groupByLength =cities.stream().collect(Collectors.toMap(city -> city, city -> city.length()));
        System.out.println(groupByLength);
    }
}
