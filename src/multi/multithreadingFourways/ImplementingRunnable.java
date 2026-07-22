package multi.multithreadingFourways;

public class ImplementingRunnable  implements Runnable
{
    public void  run()
    {
        System.out.println("Implementing Runnable interface Thread is running");
    }
    public static void main(String[] args)
    {
        ImplementingRunnable obj =new ImplementingRunnable();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
