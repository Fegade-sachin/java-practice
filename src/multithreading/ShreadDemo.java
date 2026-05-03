package multithreading;
class ShearData{
    int count=0;
}
class ShearThread extends Thread{
    ShearData data;
    ShearThread(ShearData data){
        this.data=data;
    }
    public void run()
    {
        data.count++;
        System.out.println("current thread name "+Thread.currentThread().getName()+" count : "+data.count);

    }
}
public class ShreadDemo
{
    public static void main(String[] args)
    {
         ShearData data=new ShearData();
         ShearThread t1=new ShearThread(data);
         ShearThread t2=new ShearThread(data);
         t1.start();
         t2.start();
    }
}
