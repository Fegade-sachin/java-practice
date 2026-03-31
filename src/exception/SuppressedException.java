package exception;

public class SuppressedException
{

        public static void main(String[] args) {
            try {
                try {
                    throw new ArithmeticException("Exception in try");
                } finally {
                    throw new NullPointerException("Exception in finally");
                }
            } catch (Exception e) {

                System.out.println("Main Exception: " + e);

                for (Throwable t : e.getSuppressed()) {
                    System.out.println("Suppressed: " + t);

                }
            }
        }
}
