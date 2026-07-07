package java8.company.ems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class AverageSalaryOfMaleAndFemaleEmployees
{
    public static void main(String[] args)
    {
        List<Employee> emplist=employee();
        Map<String,Double> averageSalaryOfMaleAndFemaleEmp=emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfMaleAndFemaleEmp);

    }
}
