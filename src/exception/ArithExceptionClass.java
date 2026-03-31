package exception;
/*
Object
  ↓
Throwable
  ↓
Exception → Checked
  ↓
RuntimeException → Unchecked
 */
public class ArithExceptionClass
{
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Handled: " + e);
        }
        finally {
            System.out.println("Always executes");
        }
    }
}
