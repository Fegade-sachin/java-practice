package exception;

public class HandleErrorExample {
    public static void main(String[] args)
    {

        try {
            // Intentionally cause OutOfMemoryError
            int[] bigArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.err.println("Error caught: Out of memory!");
        }
        finally {
            System.out.println("Error caught!");
        }
        System.out.println("Program continues after handling error.");
    }
}