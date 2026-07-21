package java8.practice;

import java.util.Arrays;
import java.util.function.Predicate;
//Use Predicate to filter even numbers.
public class UsingPredicateFilterEvenNum
{
    public static void main(String[] args) {
        Predicate<Integer> even=a->(a % 2)==0;
        int[] arr=new int[]{1,2,4,3,6,7,8,9};
        Arrays.stream(arr).
                filter(even::test)
                .forEach(System.out::println);
    }
}
