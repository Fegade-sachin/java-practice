package java8.groupingby.exe;

import java.util.*;
import java.util.stream.*;

public class ToCollectionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Govind", "Alka", "Kumar", "Udit");

        List<String> linkedList = names.stream()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(linkedList.getClass()); // class ArrayList
        System.out.println(linkedList);

        Set<String> sortedSet = names.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(sortedSet.getClass()); // class TreeSet
        System.out.println(sortedSet); // [Alka, Govind, Kumar, Udit]

        Queue<String> queue = names.stream()
                .collect(Collectors.toCollection(PriorityQueue::new));

        System.out.println(queue.getClass()); // class PriorityQueue
        System.out.println(queue.poll());     // Alka (smallest element first)

    }
}
