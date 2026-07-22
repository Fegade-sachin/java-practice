package arrays.array_program_practice;

public class DeadlockFreeExample
{
    public static void main(String[] args)
    {
     Object  lock1 = new Object();
        Object lock2 = new Object();
        Thread t1 = new Thread(()->{
            synchronized (lock1)
            {
                System.out.println(Thread.currentThread().getName() + "lock1 is running");
                synchronized (lock2)
                    {
                        System.out.println(Thread.currentThread().getName() + "lock1 is running");
                        System.out.println(Thread.currentThread().getName() + "lock2 is running");
                    }
            }

        });
        Thread t2 = new Thread(()->{
            synchronized (lock1)
            {
                System.out.println(Thread.currentThread().getName() + "lock1 is running");
                synchronized (lock2)
                {
                    System.out.println(Thread.currentThread().getName() + "lock1 is running");
                    System.out.println(Thread.currentThread().getName() + "lock2 is running");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
