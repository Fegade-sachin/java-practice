package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers
{
    public static void main(String[] args) {
        List list = Arrays.asList(8,4,5,3,5,9);
        Object SortedList=list.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending Order"+SortedList);
        Object reverseOrder =list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending Order"+reverseOrder);

    }
}
