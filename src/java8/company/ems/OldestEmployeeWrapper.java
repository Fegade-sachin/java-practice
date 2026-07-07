package java8.company.ems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java8.company.ems.Employee.employee;

public class OldestEmployeeWrapper
{
    public static void main(String[] args)
    {

        List<Employee> empList = employee();
        Optional<Employee>olestEmp =empList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee= olestEmp.get();
        System.out.println("name : "+oldestEmployee.getName());
        System.out.println("salary : "+oldestEmployee.getSalary());
        System.out.println("age : "+oldestEmployee.getAge());
        System.out.println("salary : "+oldestEmployee.getDepartment());
    }
}
