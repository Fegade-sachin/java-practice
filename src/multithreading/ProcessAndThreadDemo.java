package multithreading;

class Processthread implements Runnable{
    public void run(){
        System.out.println("current thread id "+Thread.currentThread().getId());
        System.out.println("current Process id "+ProcessHandle.current().pid());
    }
}
public class ProcessAndThreadDemo
{
    public static void main(String[] args)
    {
        Processthread p=new Processthread();
        Thread thread1= new Thread(p);
        Thread thread2=new Thread(p);
        thread1.start();
        thread2.start();
    }
}
