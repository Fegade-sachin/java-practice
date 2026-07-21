package java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsingMapToUppercase
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("govind", "rahul", "sneha", "priya");
        List<String> uppercase=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors
                        .toList());
        System.out.println(" Convert To UpperCase "+uppercase);
    }
}
