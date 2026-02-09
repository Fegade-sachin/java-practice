package HybridI_nheritance;
class bilding1
{
    void method1()
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
    void method2()
    {
        int a=0;
        System.out.println("this is a SingleInheritance class method");
        System.out.println("10-2");
        System.out.println(a+++a);
        a--;
        System.out.println(a+a);
    }
}
class number1 extends bilding1
{
    int num;
    void meth1 (int num)
    {
        System.out.println(num);
        System.out.println(num*num);
        System.out.println(num*num*num);
    }
}
class number2 extends number1
{
    int num=87;
    void meth2( )
    {
        System.out.println(num);
        System.out.println(num+num*num);
    }
}
public class Hybrid_6
{
    public static void main(String[] args) {
        number2 obj1=new number2();
        obj1.meth2();
        obj1.meth1(11);
        System.out.println("---------------------------------------------------------------------------------------------");
        bilding2 obj2=new bilding2();
        obj2.method2();
        obj2.method1();

    }


}
