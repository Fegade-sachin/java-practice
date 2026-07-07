package java8.company.ems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class MaleAndFemaleInSalesAndMarketingTeam
{
    public static void main(String[] args)
    {
        List<Employee> emplist=employee();
        Map<String,Long> maleAndFemale=emplist.stream().filter(e->e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(maleAndFemale);
    }
}
