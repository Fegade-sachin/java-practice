package java8.collect.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionWordsBasedOnLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("mango", "kiwi", "strawberry", "peach", "papaya", "pear");


        Map<Boolean, List<String>> partitionedByLength =
                words.stream()
                        .collect(Collectors.partitioningBy(word -> word.length() > 5));

        System.out.println("Words longer than 5 characters: " + partitionedByLength.get(true));
        System.out.println("Words 5 characters or shorter: " + partitionedByLength.get(false));
    }
}