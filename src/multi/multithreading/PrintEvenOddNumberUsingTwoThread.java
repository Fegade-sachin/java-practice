package multi.multithreading;

class NumberPrinter {

    int number = 1;
    int limit = 10;

    // print odd numbers
    synchronized void printOdd() {
        while (number <= limit) {

            if (number % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }

    // print even numbers
    synchronized void printEven() {
        while (number <= limit) {

            if (number % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
}

public class PrintEvenOddNumberUsingTwoThread {
    public static void main(String[] args) {

        NumberPrinter obj = new NumberPrinter();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}