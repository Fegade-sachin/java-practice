package java8.groupingby.exe;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectingAndThen
{
    public static void main(String[] args)
    {
        List<String> names = List.of("John", "Sarah", "Mark");
        names.stream()
                .collect(Collectors.collectingAndThen(Collectors.joining(","), Optional::of));
        System.out.println(names);
    }
}
