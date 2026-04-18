package multithreading;

class NumPrinter {
    int number = 1;
    int limit = 10;

    synchronized public void odd() {
        while (number <= limit) {
            while (number % 2 == 0) { // wait if not odd
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " -> Odd: " + number);
            number++;
            notify();
        }
    }

    synchronized public void even() {
        while (number <= limit) {
            while (number % 2 == 1) { // wait if not even
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " -> Even: " + number);
            number++;
            notify();
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        NumPrinter num = new NumPrinter();

        Thread t1 = new Thread(() -> num.odd(), "OddThread");
        Thread t2 = new Thread(() -> num.even(), "EvenThread");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
