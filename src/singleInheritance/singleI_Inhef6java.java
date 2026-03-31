package singleInheritance;
class clothes1
{
    void meth1()
    {
            System.out.println("meth1 ");
            System.out.println("------------------------------------------------");
            System.out.println(99/2*3);
            long a=88;
            if(a>6)
            {
                boolean b=a%2==0;
                System.out.println(b);

            }

    }
}
class clothes2 extends clothes1
{
    void meth2()
    {
        System.out.println("meth2 ");
        System.out.println("----------------------------------------------");
            int A=10,B=20;
            System.out.println("this is an child1 Class In this class we will use single inheritance");
            System.out.println(A+B);

    }
}

public class singleI_Inhef6java
{
    public static void main(String args[])
    {

        clothes2 cobj=new clothes2();
        cobj.meth1();
        cobj.meth2();
    }
}
