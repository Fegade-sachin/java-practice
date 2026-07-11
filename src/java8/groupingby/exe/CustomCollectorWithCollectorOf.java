package java8.groupingby.exe;

import java.util.stream.Collector;
import java.util.stream.Stream;

public class CustomCollectorWithCollectorOf

{
    public static void main(String[] args)
    {
        Collector<String, StringBuilder, String> joiningCollector = Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString);

        String result = Stream.of("a", "b", "c").collect(joiningCollector);
        System.out.println(result);

    }
}
