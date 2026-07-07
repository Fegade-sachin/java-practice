package java8.company.ems;

import java.util.List;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class MailAndFemaleEmployeeInOrganization
{
    public static void main(String[] args) {
        List<Employee> list= employee();
       Object groupByMailAndFemale = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       System.out.println(groupByMailAndFemale);

    }
}
