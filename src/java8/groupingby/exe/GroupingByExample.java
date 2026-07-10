package java8.groupingby.exe;



import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

record Person(int id, String name, double salary, Department department) {


        record Department(int id, String name) {
        }
    record Pair(double salary, Person.Department department) {}

    public static void main(String[] args) {
            List<Person> persons = List.of(
                    new Person(1, "Alex", 100d, new Department(1, "HR")),
                    new Person(2, "Brian", 200d, new Department(1, "HR")),
                    new Person(3, "Charles", 900d, new Department(2, "Finance")),
                    new Person(4, "David", 200d, new Department(2, "Finance")),
                    new Person(5, "Edward", 200d, new Department(2, "Finance")),
                    new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
                    new Person(7, "George", 900d, new Department(3, "ADMIN"))
            );
            //Grouping all persons by department
//            Map<Department, List<Person>> map1 = persons
//                    .stream().collect(groupingBy(Person::department));
//
//            System.out.println(map1);
           // Grouping all person ids by department
/*            Map<Department, List<Integer>> map2 = persons.stream()
                    .collect(groupingBy(Person::department, mapping(Person::id, toList())));

            System.out.println(map2);*/
        //Group by distinct department and salary pairs
   /*     Map<Object, List<Integer>> map = persons.stream()
                .collect(groupingBy(person -> new Pair(person.salary(), person.department()),
                        mapping(Person::id, toList())));

        System.out.println(map);*/
        //Count persons by department
//        Map<Department,Long> contPersonsByDep=persons.stream().collect(groupingBy(Person::department,counting()));
//        System.out.println(contPersonsByDep);
        //Count persons with same salary

//        Map<Double,Long> countPerson =persons.stream().collect(groupingBy(Person::salary,counting()));
//        System.out.println(countPerson);
//        Average salary in each department

//         Map<Department,Double>departmentSalary =persons.stream().collect(groupingBy(Person::department,averagingDouble(Person::salary)));
//         System.out.println(departmentSalary);

//        Max salaried person in each department
//        Map<Department, Optional<Person>> departmentMaxSalary =persons.stream().collect(groupingBy(Person::department,maxBy(Comparator.comparingDouble(Person::salary))));
//        System.out.println(departmentMaxSalary);
//
//        Filtering all persons with salary less than 300
//        Map<Department,Long> personWithLess300 = persons.stream().filter(person -> person.salary > 300).collect(groupingBy(Person::department,counting()));
//        System.out.println(personWithLess300);
        Map<Department,Long>parsonWithSalary =persons.stream().collect(groupingBy(Person::department,filtering(person -> person.salary>300d,counting())));
System.out.println(parsonWithSalary);
        }
    }
