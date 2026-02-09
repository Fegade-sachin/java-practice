package static_Instance;

public class StaticKeyword
{
    static//call first
    {
     System.out.println("Static 1 block Initialized");
    }
    static//we can write any number of static block
    {
        System.out.println("Static2 block Initialized");
    }
    static void meth1()//then method call when ever main call meth1
    {
       System.out.println("Static called meth1");
    }
    public static void main(String[] args)
    {
        meth1();//static method call
    }
    static //after first static block
    {
        System.out.println("Static 3 block ");
    }
}
