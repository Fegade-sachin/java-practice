package singleInheritance;

class tree
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
public class singleI_Inhef8
{
    public static void main(String[] args)
    {
        oak obj=new oak();
        obj.method1();
        obj.method2();
    }

}
