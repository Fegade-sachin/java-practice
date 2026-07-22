package opps.inheritance.singleInheritance;

class man1
{
    void meth1()
    {
        System.out.println("meth1");
        int a,b;
        System.out.println("this is method of the child class method show");
        a=45;
        b=89;
        System.out.println("show method only sow data :a " +a+" b  "+b);
        System.out.println("------------------------------------------------------------------");
    }

}
class man2 extends man1
{
    void meth2()
    {
        System.out.println("meth2");
        int a,b;
        a=0;
        a++;
        b=10;
        System.out.println(a+b);
    }
}
public class singleI_Inhef7
{
    public static void main(String[] args) {
        man2 mobj=new man2();
        mobj.meth2();
    }
}