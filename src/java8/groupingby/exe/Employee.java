package java8.groupingby.exe;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private Department department;

    // Constructor
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + "]";
    }

    public static void main(String[] args) {
        // Sample employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Department.IT),
                new Employee("Bob", Department.IT),
                new Employee("Charlie", Department.HR),
                new Employee("David", Department.SALES),
                new Employee("Eve", Department.HR)
        );

        // Group employees by department and map to names
        Map<Department, List<String>> departmentEmployeeNames = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(departmentEmployeeNames);

    }
}

// Enum for departments
enum Department { HR, IT, SALES }
