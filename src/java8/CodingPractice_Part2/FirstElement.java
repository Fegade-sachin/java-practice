package java8.CodingPractice_Part2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement
{
    public static void main(String[] args) {
        List list= Arrays.asList(7,2,3,4,5,6,7,8,9,5);
        Optional first =list.stream().findFirst();
        System.out.println(first.get());

    }
}
