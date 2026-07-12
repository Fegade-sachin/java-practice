package java8.groupingby.exe;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningCollector
{
    public static void main(String[] args)
    {
        List<String> words = List.of("Java", "Stream", "API");
        words.stream().collect(Collectors.joining(","));
        System.out.println(words);
    }
}
