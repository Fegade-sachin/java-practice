package exception;

public class BeforeReturnCheckFinally
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Try block ");
            return;//after finally it will return
        }
        finally
        {
            System.out.println("Finally Block");
        }
    }
}
//Even if return is in try, finally will execute.