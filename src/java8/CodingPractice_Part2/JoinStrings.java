package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Docker");
        String joinString=list.stream().collect(Collectors.joining(","));
        System.out.println(joinString);

    }
}
