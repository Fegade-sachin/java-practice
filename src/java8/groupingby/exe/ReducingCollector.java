package java8.groupingby.exe;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReducingCollector
{
    public static void main(String[] args)
    {
      List numbers= Arrays.asList(1,2,3,4,5);
     Object sumOfAllEle= numbers.stream().collect(Collectors.reducing(0,Integer::sum));
      System.out.println(sumOfAllEle);
    }
}
