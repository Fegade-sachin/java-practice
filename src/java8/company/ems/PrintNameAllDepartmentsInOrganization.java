package java8.company.ems;

import java.util.List;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class PrintNameAllDepartmentsInOrganization
{
    public static void main(String[] args)
    {

//    Use distinct() method after calling map(Employee::getDepartment) on the stream. It will return unique departments.
       List<Employee> listOfDepartmentName= employee();
       List<String> nameOfAllEmployee=listOfDepartmentName.stream().map(e->e.department).distinct().collect(Collectors.toList());
       System.out.println(nameOfAllEmployee);
    }
}
