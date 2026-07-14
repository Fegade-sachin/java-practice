package java8.collect.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

class Student {
    private String name;
    private String surname;
    private String city;
    private double avgGrade;
    private int age;

    // Constructor
    public Student(String name, String surname, String city, double avgGrade, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.avgGrade = avgGrade;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getCity() { return city; }
    public double getAvgGrade() { return avgGrade; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setCity(String city) { this.city = city; }
    public void setAvgGrade(double avgGrade) { this.avgGrade = avgGrade; }
    public void setAge(int age) { this.age = age; }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", avgGrade=" + avgGrade +
                ", age=" + age +
                '}';
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Smith", "Miami", 7.38, 19),
                new Student("Jane", "Miles", "New York", 8.4, 21),
                new Student("Michael", "Peterson", "New York", 7.5, 20),
                new Student("Gabriella", "Robertson", "Miami", 9.1, 20),
                new Student("Kyle", "Miller", "Miami", 9.83, 20)
        );

        // Print students
        //students.forEach(System.out::println);
      /*  Map<Boolean, List<String>> partitionByNameLength = students.stream()
                .map(Student::getName) // extract names
                .collect(Collectors.partitioningBy(name -> name.length() > 4));

        System.out.println(partitionByNameLength);*/

//        Map<Boolean, List<Student>> partitionByNameAvgGrade = students.stream()
//                .collect(Collectors.partitioningBy(student->student.getName().length() > 8
//                        && student.getAvgGrade() > 8.0));
//
//        System.out.println(partitionByNameAvgGrade);

 //       Map<Boolean, List<String>> partitionStudentsByName = students.stream()
//                .collect(Collectors.partitioningBy(student->student.getName().length() > 8
//                                && student.getAvgGrade() > 8.0,
//                        Collectors.mapping(Student::getName, Collectors.toList())));
//
//        System.out.println(partitionStudentsByName);
//
//
//        Map<Boolean, Long> partitionByAvgGrade = students.stream()
//                .collect(Collectors.partitioningBy(student->student.getAvgGrade() > 8.0,
//                        Collectors.counting()));
//
//        System.out.println(partitionByAvgGrade);
    }
}
