package multithreading;


    public class ThreadExceptionDemo extends Thread {
        public static void main(String[] args) throws InterruptedException {
            multithreading.ThreadExceptionDemo t1 = new multithreading.ThreadExceptionDemo();
            t1.setName("Thread1");

            t1.start();
            t1.join();

            //  Starting the same thread again causes IllegalThreadStateException
            t1.start();
        }

        @Override
        public void run() {
            System.out.println("Running " + Thread.currentThread().getName());
        }
    }
