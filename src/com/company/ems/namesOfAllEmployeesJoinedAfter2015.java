package com.company.ems;

import java.util.List;
import java.util.stream.Collectors;

import static com.company.ems.Employee.employee;

public class namesOfAllEmployeesJoinedAfter2015
{
    public static void main(String[] args) {
        List<Employee> list=employee();
        List yearAfter2015=list.stream()
                .filter(e->e.getYearOfJoining()>2015)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(yearAfter2015);
    }
}
