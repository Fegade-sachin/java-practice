package java8.company.ems;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class AllEmployeesNameInEachDepartment
{
    public static void main(String[] args)
    {
        List<Employee> emplist=employee();
        Map names=emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String,List<Employee>>> entryset=names.entrySet();
        for(Map.Entry<String,List<Employee>> entry:entryset)
            {
                System.out.println("--------------------------------------");

                System.out.println("Employees In "+entry.getKey() + " : ");

                System.out.println("--------------------------------------");
                List<Employee> list=entry.getValue();
                for(Employee e:list)
                {
                    System.out.println(e.getName());
                }
            }

    }
}
