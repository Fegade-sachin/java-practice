package java8.groupingby.exe;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertIntoCollection
{
    public static void main(String[] args)
    {
//        List<String> list = Stream.of("java", ".net", "python")
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println(list);
//
//        //
//        Set<String> set = Stream.of("java", ".net", "python")
//                .map(String::toUpperCase)
//                .collect(Collectors.toSet());
//        TreeSet<String> treeSet = Stream.of("java", ".net", "python")
//                .map(String::toUpperCase)
//                .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(treeSet);
//        Map<String, Integer> result = Stream.of("java", ".net", "python")
//                .collect(Collectors.toMap(String::toLowerCase, String::length));
//        System.out.println(result);
        Map<String, Integer> result = Stream.of("java", ".net", "python", "jAvA")
                .collect(Collectors.toMap(String::toUpperCase, String::length, (value1, value2) -> value1));
        System.out.println(result);
    }
}
