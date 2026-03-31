package singleInheritance;
class number1
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
public class singleI_Inhef6
{
    public static void main(String[] args)
    {
        number2 nobj=new number2();
        nobj.meth1(14);
        nobj.meth2();

    }
}
