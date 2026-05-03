package multithreadingFourways;

import java.util.concurrent.*;

public class UsingCallableFuture
{
    public static void main(String[] args) throws Exception
    {
        Callable<Integer> talk = () ->
        {
          return 10+20;
        };
        ExecutorService Service = Executors.newSingleThreadExecutor();
        Future<Integer> result = Service.submit(talk);

        System.out.println(result.get());// waits and gets result
        Service.shutdown();

    }
}

