package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaximumNumber
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,4,5,3,5,9);
        Optional<Integer> maxVal=list.stream().max(Integer::compareTo);
        System.out.println(maxVal);
        Object max=list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(max);

    }
}
