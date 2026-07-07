package java8.company.ems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class CountNumberEmployeesEachDepartment
{
    public static void main(String[] args)
    {
        List<Employee> emp=employee();
       Map<String,Long> countEmp =emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(countEmp);
    }
}
