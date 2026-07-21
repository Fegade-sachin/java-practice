package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.List;

public class CountElements
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 12, 22, 33, 24, 4, 5);
        Long  count=list.stream().filter(f -> f > 10).count();
        System.out.println("given number is "+count);

    }
}
