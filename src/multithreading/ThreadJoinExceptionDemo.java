package multithreading;
public class ThreadJoinExceptionDemo extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinExceptionDemo t2 = new ThreadJoinExceptionDemo();
        t2.setName("Thread2");

        //  Calling join before start leads to the main thread waiting forever
        t2.join(); // Deadlock-like behavior
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
    }
}

