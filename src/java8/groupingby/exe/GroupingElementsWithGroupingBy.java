package java8.groupingby.exe;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingElementsWithGroupingBy
{
    public static void main(String[] args) {
        List<String> names = List.of("John", "Sarah", "Mark", "Sarah", "Eric");
        Map<String,Long> groupedElement=names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(groupedElement);


    }
}
