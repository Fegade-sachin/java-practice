package java8.company.ems;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class HighestPaidEmployeeOrganization
{
    public static void main(String[] args) {
//        Use Collectors.maxBy() method which returns maximum element wrapped in an Optional object based on supplied Comparator.
        List<Employee> list=employee();
        Optional<Employee> maxPaidEmp =list.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));
                   Employee highestPaidEmployee = maxPaidEmp.get();
        System.out.println("Details Of Highest Paid Employee : ");

        System.out.println("==================================");

        System.out.println("ID : "+highestPaidEmployee.getId());

        System.out.println("Name : "+highestPaidEmployee.getName());

        System.out.println("Age : "+highestPaidEmployee.getAge());

        System.out.println("Gender : "+highestPaidEmployee.getGender());

        System.out.println("Department : "+highestPaidEmployee.getDepartment());

        System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());

        System.out.println("Salary : "+highestPaidEmployee.getSalary());
    }
}
