package java8.company.ems;

import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class WhatIsTheAverageAgeMaleAndFemaleEmployees
{
    public static void main(String[] args)
    {
        /*Use same method as query 3.1 but pass Collectors.averagingInt(Employee::getAge) as the second argument to Collectors.groupingBy().*/
        java.util.List  emplist = employee();
       Object  list =emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
       System.out.println(list);

    }
}
