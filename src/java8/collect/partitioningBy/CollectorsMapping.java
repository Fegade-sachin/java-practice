package java8.collect.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMapping
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mike", "Michael", "Joe", "James");
        Map<Boolean, List<String>> partitionByNameLength = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4,
                        Collectors.mapping(String::toUpperCase, Collectors.toList())));

        System.out.println(partitionByNameLength);
    }
}
