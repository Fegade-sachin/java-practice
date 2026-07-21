package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUppercase
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("java", "spring", "docker");
        List list=names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Names to uppercase "+ list);
    }
}
