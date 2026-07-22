package opps.inheritance.singleInheritance;
class bilding1
{
    void method()
    {
        int a=0;
        System.out.println("this is a SingleInheritance class method");
        System.out.println("10/2");
        System.out.println(a++);
        a--;
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}
class bilding2 extends bilding1
{
    void method()
    {
        int a=0;
        System.out.println("this is a SingleInheritance class method");
        System.out.println("10-2");
        System.out.println(a+++a);
        a--;
        System.out.println(a+a);
    }
}

public class singleI_Inhef5
{
    public static void main(String[] args) {
        bilding2 b = new bilding2();
        b.method();
    }

}
