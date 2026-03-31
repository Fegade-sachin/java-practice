package singleInheritance;
class city1
{
     void meth1()
    {
        System.out.println("meth1");
        System.out.println("Welcome to city1");
    }
}
class city2 extends city1
{
    String s="java";
     void meth2(){
        System.out.println("meth2");
        System.out.println("Welcome to city2");
        System.out.println(s);
    }
}
public class singleI_Inhef9
{
    public static void main(String[] args)
    {


        city2 c2=new city2();
        c2.meth2();
        c2.meth1();
    }
}
