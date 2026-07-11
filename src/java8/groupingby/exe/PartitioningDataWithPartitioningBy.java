package java8.groupingby.exe;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface PartitioningDataWithPartitioningBy
{
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
       java.util.Map<Boolean,List<Integer>> partitionbyEvenOdd = numbers.stream().collect(Collectors.partitioningBy(p->p%2==0));
       System.out.println(partitionbyEvenOdd);

    }
}
