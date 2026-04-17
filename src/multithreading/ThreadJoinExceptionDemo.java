package multithreading;
public class ThreadExceptionJoinDemo extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ThreadExceptionDemo t1 = new ThreadExceptionDemo();
        t1.setName("Thread1");

        t1.start();
        t1.join();

        // IllegalThreadStateException: cannot start a thread twice
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
    }
}
