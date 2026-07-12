package java8.groupingby.exe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CreatingMapsWithToMap
{
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","carrot");
        Map<String,Integer> mapElement=list.stream().collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(mapElement);
    }
}
