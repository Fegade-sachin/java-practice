package opps.inheritance.singleInheritance;
class Record1
{
    void  display1()
    {
        int a=35, b=46;
        System.out.println("Display 1");
        System.out.println("addition" +a+b);
    }
}
class Record2 extends Record1
{
    void   display2()
    {
        System.out.println("Display 2");
        System.out.println(10*2);
    }
}

public class singleI_Inhe4
{
    public static void main(String[] args)
    {
       Record2 robj= new Record2();
       robj.display2();
       robj.display1();
    }
}
