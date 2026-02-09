package multi_level_Inheritance;

class animal
{
    void meth1()
    {
        System.out.println("this is a multil_levchild2child class method");
        System.out.println("10*2");
        System.out.println(10*2);
        System.out.println("-----------------------------------------------------------------------");
    }
}
  class cat extends animal
{
    void  c1()
    {
        System.out.println("this is a GGp class method");
        System.out.println("10/2");
        System.out.println(10/2);
        System.out.println("__________________________________________________________________________________");
    }

}
class dog extends cat
{
    void d2()
    {
        System.out.println("this is a multil_levchild2 child  class method");
        System.out.println("java"+"is"+"awesome");

    }
}
public class multi_level_i1 extends dog
{


    public static void main(String[] args) {
        multi_level_i1 m = new  multi_level_i1();
        m.c1();
        m.meth1();
        m.d2();
    }

}