package java8.practice;
//Use Consumer to print a list.
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingConsumerPrintList
{
    public static void main(String[] args) {
        Consumer<Integer> PrintNumber = num->System.out.println(num);
        List<Integer> list= Arrays.asList(1,3,6,7,8,9,5,4);
        list.forEach(PrintNumber);
    }
}
