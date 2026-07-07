package java8.optionalClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Student {
    private String name;
    private String email; // Can be null if not provided

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Returns an Optional because an email might not exist
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public String getName() {
        return name;
    }
}
public class StudentRegistry {
    // Simulating a database
    private static final Map<Integer, Student> database = new HashMap<>();

    static {
        database.put(1, new Student("Alice", "alice@univ.edu"));
        database.put(2, new Student("Bob", null)); // Bob didn't provide an email
    }

    // 1. This method safely returns an Optional instead of null
    public static Optional<Student> findStudentById(int id) {
        Student student = database.get(id);
        return Optional.ofNullable(student); // Returns empty Optional if id doesn't exist
    }

    public static void main(String[] args) {

        System.out.println("--- Test 1: Alice (Everything exists) ---");
        processStudentEmail(1);

        System.out.println("\n--- Test 2: Bob (Student exists, but email is null) ---");
        processStudentEmail(2);

        System.out.println("\n--- Test 3: Charlie (Student ID does not exist) ---");
        processStudentEmail(99);
    }

    public static void processStudentEmail(int id) {
        Optional<Student> studentOpt = findStudentById(id);

        // The Modern/Functional Approach:
        // flatMap and map allow us to dig inside the Optional chain safely
        String emailResult = studentOpt
                .flatMap(Student::getEmail)
                .map(String::toUpperCase)
                .orElse("NO EMAIL AVAILABLE");

        System.out.println("Result for ID " + id + ": " + emailResult);
    }
}