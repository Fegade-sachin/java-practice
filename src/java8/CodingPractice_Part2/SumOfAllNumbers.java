package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllNumbers
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,5);
       int sumOfAll=list.stream().mapToInt(Integer::intValue).sum();
       System.out.println(sumOfAll);
       int sumCollector=list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum using Collectors: " + sumCollector);
       Integer sumUsingReduce= list.stream().reduce(0,Integer::sum);
        System.out.println("Sum using Reducer: " + sumUsingReduce);

    }
}
