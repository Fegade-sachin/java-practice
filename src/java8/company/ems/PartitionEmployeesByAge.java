package java8.company.ems;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class PartitionEmployeesByAge
{
    public static void main(String[] args)
    {
        List<Employee> emplist =employee();
        Map<Boolean,List<Employee>> partitionEmp= emplist.stream().collect(Collectors.groupingBy(e->e.getAge()>25));
        Set<Map.Entry<Boolean,List<Employee>>> partitionEmployee=partitionEmp.entrySet();
        for(Map.Entry<Boolean,List<Employee>> entry:partitionEmployee)
        {
            System.out.println("----------------------------");

            if (entry.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }

        }

    }
}
