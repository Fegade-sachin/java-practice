package java8.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingByExample
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Akhil");
        Map<Character,List< String>> groupedByChar =names.stream().collect(Collectors.groupingBy(name ->name.charAt(0)));
        System.out.println(groupedByChar);
    }
}
