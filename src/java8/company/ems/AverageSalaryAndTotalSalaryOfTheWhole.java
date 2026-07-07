package java8.company.ems;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static java8.company.ems.Employee.employee;

public class AverageSalaryAndTotalSalaryOfTheWhole
{
    public static void main(String[] args) {
        List<Employee> emplist=employee();
        DoubleSummaryStatistics averageSalary= emplist.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary"+averageSalary.getAverage());
        System.out.println("Total Sum "+averageSalary.getSum());

    }
}
