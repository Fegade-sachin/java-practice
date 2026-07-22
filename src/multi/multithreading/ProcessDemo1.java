package multi.multithreading;

public class ProcessDemo1
{
    public static void main(String[] args) {
     System.out.println("first process");
     System.out.println("process id"+ProcessHandle.current().pid());
    }
}
