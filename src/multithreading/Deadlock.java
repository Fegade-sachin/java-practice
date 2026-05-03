package multithreading;

public class Deadlock
{
    public static void main(String[] args)
    {
      Deadlock lock1 = new Deadlock();
      Deadlock lock2 = new Deadlock();
      Thread t1=new Thread()
      {
         public void run() {
              synchronized (lock1) {
                  System.out.println("lock1 excuated");
                  synchronized (lock2) {
                      System.out.println("lock2 excuated");
                  }
              }
          }
      };
      t1.start();
      Thread t2=new Thread(){
          public void run() {
              synchronized (lock2) {
                  System.out.println("lock2 excuated");
                  synchronized (lock1) {
                      System.out.println("lock1 excuated");
                  }
              }
          }
      };
      t2.start();
    }
}
