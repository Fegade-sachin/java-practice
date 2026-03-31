package exception;

public class HandleErrorExample2 {
    static void recursiveMethod() {
        recursiveMethod(); // infinite recursion
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.err.println("Error caught: Stack overflow!");
            e.printStackTrace(System.err);
        }
        System.out.println("Program continues after handling error.");
    }
}