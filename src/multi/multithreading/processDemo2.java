package multi.multithreading;

public class processDemo2
{
    public static void main(String[] args) {
        System.out.println("process second");
        System.out.println("Process id "+ProcessHandle.current().pid());
    }
}
