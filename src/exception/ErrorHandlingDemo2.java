package exception;
public class ErrorHandlingDemo2 {
    public static void main(String[] args) {
        try {
            int[] bigArray = new int[Integer.MAX_VALUE]; // OutOfMemoryError
        } catch (OutOfMemoryError e) {
            // Logging
            System.err.println("Critical Error: " + e);
            e.printStackTrace();

            // Graceful shutdown
            System.err.println("Shutting down safely...");
            System.exit(1); // exit with error code
        }
    }
}