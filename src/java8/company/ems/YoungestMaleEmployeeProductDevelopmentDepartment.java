package java8.company.ems;

import javax.management.ConstructorParameters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java8.company.ems.Employee.employee;

public class YoungestMaleEmployeeProductDevelopmentDepartment
{
    public static void main(String[] args) {
        List<Employee> empllist=employee();
        Optional<Employee> youngestMaleEmp=empllist.stream()
                .filter(e->e.getGender().equals("Male") && e.getDepartment()
                        .equals( "Product Development"))
                .min(Comparator.comparingInt(Employee::getAge));
       Employee youngestMaleEmployeeInProductDevelopment=youngestMaleEmp.get();
        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());

        System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());

        System.out.println("Year Of Joining : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

        System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());

    }
}
