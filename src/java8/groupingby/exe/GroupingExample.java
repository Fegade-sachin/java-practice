package java8.groupingby.exe;

import java.util.*;
import java.util.stream.Collectors;

class Departments {
    private final String name;

    public Departments(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departments)) return false;
        Departments d = (Departments) o;
        return Objects.equals(name, d.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Employees {
    private final String name;
    private final Departments department;
    private final double salary;
    private final String role;

    public Employees(String name, Departments department, double salary, String role) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.role = role;
    }

    public String getName() { return name; }
    public Departments getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return String.format("%s (%s, %.2f)", name, role, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        Employees e = (Employees) o;
        return Double.compare(e.salary, salary) == 0 &&
                Objects.equals(name, e.name) &&
                Objects.equals(department, e.department) &&
                Objects.equals(role, e.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, role);
    }
}

public class GroupingExample {
    public static void main(String[] args) {
        Departments hr = new Departments("HR");
        Departments it = new Departments("IT");
        Departments finance = new Departments("Finance");

        List<Employees> employees = Arrays.asList(
                new Employees("Alice", hr, 50000, "Recruiter"),
                new Employees("Bob", hr, 60000, "Manager"),
                new Employees("Charlie", it, 70000, "Developer"),
                new Employees("David", it, 80000, "Architect"),
                new Employees("Eve", finance, 90000, "Analyst"),
                new Employees("Frank", finance, 95000, "Manager")
        );

        // 1. Average salary by department
        Map<Departments, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.averagingDouble(Employees::getSalary)));
        System.out.println("Average Salary by Department: " + avgSalary);

        // 2. Total salary by department
        Map<Departments, Double> totalSalary = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.summingDouble(Employees::getSalary)));
        System.out.println("Total Salary by Department: " + totalSalary);

        // 3. Employee count by department
        Map<Departments, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.counting()));
        System.out.println("Employee Count by Department: " + countByDept);

        // 4. Names by department
        Map<Departments, List<String>> namesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.mapping(Employees::getName, Collectors.toList())));
        System.out.println("Names by Department: " + namesByDept);

        // 5. Highest paid employee by department
        Map<Departments, Optional<Employees>> highestPaid = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))));
        System.out.println("Highest Paid Employee by Department: " + highestPaid);

        // 6. Multi-level grouping: Department -> Role -> Employees
        Map<Departments, Map<String, List<Employees>>> deptRoleEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,
                        Collectors.groupingBy(Employees::getRole)));
        System.out.println("Employees grouped by Department and Role: " + deptRoleEmployees);
    }
}
