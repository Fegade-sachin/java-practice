package abstraction;

class parent1
{
    int a=10;
    parent1()
    {
        System.out.println("Static 1 block Initialized");
        System.out.println(a);
        method1();
    }
    void method1()
    {
        System.out.println("Static 1 block Called");
        System.out.println(a);
    }
}
public class ChildClass extends parent1
{
    int a=1;
    ChildClass()
    {
        System.out.println("Static 1 block Initialized");
        System.out.println(a);
        method1();
    }
    void method1()
    {
        System.out.println("Static 1 block Initialized");
        System.out.println(a);//0//1
    }

   public static void main(String args[])
    {
        new ChildClass();
    }
}
