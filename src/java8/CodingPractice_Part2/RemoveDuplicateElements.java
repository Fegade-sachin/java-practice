package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> listOfNonDuplicate=list.stream().distinct().collect(Collectors.toList());
        System.out.println(listOfNonDuplicate);

    }
}
