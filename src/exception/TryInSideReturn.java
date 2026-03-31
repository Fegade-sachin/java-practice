package exception;

public class TryInSideReturn
{
	public static void main(String[] args)
	{
        try
        {
            return;
        }
       finally {
            System.out.println(10/0);// Exception here

        }
    }
}
/*
Exception in thread "main" java.lang.ArithmeticException
 */