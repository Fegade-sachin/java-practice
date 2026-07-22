package opps.inheritance.hybridI_nheritance;

class vehicle2
{
    public void start()
    {
        System.out.println("vehicale start");
    }
    public void drive()
    {
        System.out.println("vehicle drive");
    }
}
class HeavyVehicle extends vehicle2
{
    public void load()
    {
        System.out.println("Heavy vehicle  carys have been loaded");
    }
}
class bus extends HeavyVehicle
{
    public void travel()
    {
        System.out.println("bus is traveling with passengers");
    }
}
class tree extends vehicle2
{
    void method1(){
        int a=10;
        System.out.println("method1");
        int b=89;
        System.out.println("show method only sow data :a " +a+" b  "+b);
        System.out.println("------------------------------------------------------------------");
    }

}
class  oak extends tree
{

    void method2()
    {
        System.out.println("method2");
        System.out.println("java is awesome !");
    }
}
public class Hybrid_3
{
    public static void main(String[] args)
    {
        bus b=new bus();
        b.start();
        b.drive();
        b.load();
        b.travel();
        System.out.println("-------------------------------------------------------");
        oak o=new oak();
        o.method2();
        o.method1();
    }
}
