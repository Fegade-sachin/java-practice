package HybridI_nheritance;

class Vehicle
{
    public void r1()
    {
        System.out.println("This is a Vehicle");
    }
}
class twoWheelerVehicle extends Vehicle
{
    public void r2()
    {
        System.out.println("This is a twoWheelerVehicle run");
    }
}
class bikeVehicle extends twoWheelerVehicle
{
    public void r3()
    {
        System.out.println("This is a bikeVehicle run");

    }
}
class man1 extends Vehicle
{
    void meth1()
    {
        System.out.println("meth1");
        int a,b;
        System.out.println("this is method of the child class method show");
        a=45;
        b=89;
        System.out.println("show method only sow data :a " +a+" b  "+b);

    }

}
class man2 extends man1
{
    void meth2()
    {
        System.out.println("meth2");
        int a,b;
        a=0;
        a++;
        b=10;
        System.out.println(a+b);
    }
}
public class Hybrid_4
{
    public static void main(String[] args)
    {

        bikeVehicle obj=new bikeVehicle();
        obj.r1();
        obj.r2();
        obj.r3();
        System.out.println("-------------------------------------------------------------");
        man2 m1=new man2();
        m1.meth1();
        m1.meth2();

    }
}
