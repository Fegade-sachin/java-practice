package multithreading;

public class IllegalMonitorDemo {
    public static void main(String[] args) {
        Object lock = new Object();

        // Calling wait() without synchronized block
        try {
            lock.wait();  // This will throw IllegalMonitorStateException
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
