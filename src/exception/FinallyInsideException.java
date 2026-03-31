package exception;

public class FinallyInsideException
{
        public static void main(String[] args) {
            try {

                System.out.println("Inside try");
                int x = 10 / 0;  // ArithmeticException
            } finally {
                System.out.println("Inside finally");
                int y = 20 / 0;  // Another ArithmeticException
            }
        }
}
/*

  Inside try
Inside finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception.FinallyInsideException.main(FinallyInsideException.java:11) */