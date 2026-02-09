package SingleInheritance;
class car1
    {
        int a=10;
        void method1()
        {
            System.out.println("method1");
            System.out.println("a="+a);
            System.out.println("a="+a+a);
        }
    }
    class car2 extends car1
    {
        int c=1;
        int a=10;
        int b=10;
        void  method2()
        {
            System.out.println("method2");
            System.out.println("a="+a);
            System.out.println("b="+b);
            System.out.println("c="+c);
            System.out.println("a="+a+b);
            System.out.println("This is a addtion");
        }
    }
public class singleI_Inhef10
{
    public static void main(String[] args)
    {

        car2 c2=new car2();
        c2.method1();
        c2.method2();
    }
}
