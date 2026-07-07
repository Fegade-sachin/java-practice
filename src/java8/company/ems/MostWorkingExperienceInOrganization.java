package java8.company.ems;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java8.company.ems.Employee.employee;

public class MostWorkingExperienceInOrganization
{
    public static void main(String[] args) {
        List<Employee> emplist =employee();
        Optional<Employee> mostWorkingExperience=emplist.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        Employee seniorMostEmployee =mostWorkingExperience.get();
        System.out.println("Senior Most Employee Details :");

        System.out.println("----------------------------");

        System.out.println("ID : "+seniorMostEmployee.getId());

        System.out.println("Name : "+seniorMostEmployee.getName());

        System.out.println("Age : "+seniorMostEmployee.getAge());

        System.out.println("Gender : "+seniorMostEmployee.getGender());

        System.out.println("Age : "+seniorMostEmployee.getDepartment());

        System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());

        System.out.println("Salary : "+seniorMostEmployee.getSalary());
    }
}
