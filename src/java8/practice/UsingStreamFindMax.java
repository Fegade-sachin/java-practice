package java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//Find the maximum number using streams.
public class UsingStreamFindMax
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 60, 75, 40, 90, 15);
        Optional<Integer> MaxNumber= numbers.stream().max(Integer::compareTo);
        MaxNumber.ifPresent(num-> System.out.println(num));
        int maxnum=numbers.stream().reduce(0,Integer::max);
        System.out.println("Max Numbers  "+ maxnum);

    }
}
