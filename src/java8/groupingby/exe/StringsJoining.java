package java8.groupingby.exe;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StringsJoining
{
    public static void main(String[] args)
    {
        String stringJoining=Stream.of("java", ".net", "python")
                .collect(joining(", ", "Joined String[ ", " ]"));
        System.out.println(stringJoining);
    }
}
