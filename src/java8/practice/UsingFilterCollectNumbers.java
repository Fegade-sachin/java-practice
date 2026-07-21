package java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Use filter() + collect() to collect numbers greater than 50.
public class UsingFilterCollectNumbers
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 60, 75, 40, 90, 15);
        List greaterThan50 =numbers.stream().filter(e -> e >50).collect(Collectors.toList());
        System.out.println("Numbers greater than 50: " + greaterThan50);
    }
}
