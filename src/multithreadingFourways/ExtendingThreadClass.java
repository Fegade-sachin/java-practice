package multithreadingFourways;

public class ExtendingThreadClass extends Thread
{
    public void run()
    {
        System.out.println(" Extending Thread is running");
    }
    public static void main(String[] args)
    {
        new ExtendingThreadClass().start();// start() calls run() internally
    }
}
