package java8.collect.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {
    String name;
    int age;
    String department;
    boolean isActive;

    Employees(String name, int age, String department, boolean isActive) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + department + ", Active: " + isActive + ")";
    }
}

public class PartitioningExampleToCheckEligibility {

    // Predicate method to check eligibility
    public boolean isEligible(Employees e) {
        return e.age >= 30 && e.department.equals("Engineering") && e.isActive;
    }

    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Mason", 25, "Engineering", true),
                new Employees("Olivia", 35, "HR", true),
                new Employees("Liam", 28, "Engineering", false),
                new Employees("Sophia", 42, "Marketing", true),
                new Employees("Noah", 22, "Engineering", true),
                new Employees("Isabella", 30, "Engineering", false)
        );

        PartitioningExampleToCheckEligibility example = new PartitioningExampleToCheckEligibility();

        // Partition employees based on eligibility
        Map<Boolean, List<Employees>> eligibleEmployees =
                employees.stream()
                        .collect(Collectors.partitioningBy(example::isEligible));

        System.out.println("Eligible Employees: " + eligibleEmployees.get(true));
        System.out.println("Other Employees: " + eligibleEmployees.get(false));
        System.out.println("---------------------------------");
        Map<String, List<Employees>> ageGroups =
                employees.stream()
                        .collect(Collectors.groupingBy(e -> {
                            if (e.age < 30) return "Young";
                            else if (e.age < 50) return "Middle-aged";
                            else return "Senior";
                        }));
        System.out.println("Age groups: " + ageGroups.get("Young"));
    }
}