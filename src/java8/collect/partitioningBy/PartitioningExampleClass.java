package java8.collect.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class PartitioningExampleClass {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Mason", 25),
                new Employee("Olivia", 35),
                new Employee("Liam", 28),
                new Employee("Sophia", 42),
                new Employee("Noah", 22),
                new Employee("Isabella", 30)
        );

        // Partition employees based on age
        Map<Boolean, List<Employee>> partitionedByAge =
                employees.stream()
                        .collect(Collectors.partitioningBy(e -> e.age >= 30));

        System.out.println("Employees aged 30 and above: " + partitionedByAge.get(true));
        System.out.println("Employees below 30: " + partitionedByAge.get(false));
    }
}