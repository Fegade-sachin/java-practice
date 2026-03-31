package exception;

import java.io.Closeable;

class HowclosetryWithRecourse implements Closeable
 {
    public void close()
    {
        System.out.println(" recourse close");
    }
 }
public class TryWithRecourse
 {
    public static void main(String[] args)
    {

        try (HowclosetryWithRecourse h = new HowclosetryWithRecourse())
        {
            System.out.println("try");
        }
    }
}
