package multi.multithreading;
public class LegalMonitorDemo {
    public static void main(String[] args) {
        Object lock = new Object();

        synchronized (lock) {
            try {
                lock.wait();  //  Safe, because we hold the lock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" execute normally");
    }//never end because it not hold Object
}
