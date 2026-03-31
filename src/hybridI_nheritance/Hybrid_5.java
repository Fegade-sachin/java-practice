package hybridI_nheritance;

class clothes1
{
    void meth1()
    {
        System.out.println("meth1 ");
        System.out.println("------------------------------------------------");
        System.out.println(99/2*3);
        long a=88;
        if(a>6)
        {
            boolean b=a%2==0;
            System.out.println(b);

        }

    }
}
class clothes2 extends clothes1
{
    void meth2()
    {
        System.out.println("meth2 ");
        System.out.println("----------------------------------------------");
        int A=10,B=20;
        System.out.println("this is an child1 Class In this class we will use single inheritance");
        System.out.println(A+B);

    }
}
class vehicle1 extends vehicle2
{
    void  run()
    {
        System.out.println("run");
    }
}
class car extends vehicle1
{
    void Clean()
    {
        System.out.println("Drive Car");
    }
}
class ElecricCar  extends car
{
    void Start()
    {
        System.out.println("ElecricCar");
    }

}
public class Hybrid_5
{
    public static void main(String[] args)
    {
        ElecricCar car = new ElecricCar();
        car.Start();
        car.Clean();
        car.run();
        System.out.println("----------------------------------------------");
        clothes2 cl=new clothes2();
        cl.meth1();
        cl.meth2();
    }

}
