package opps.inheritance.hybridI_nheritance;

class Number
{
    void inte()
    {
        System.out.println("interger_ inrange");
    }
}
class Decima extends Number
{
    void dec()
    {
        System.out.println("decimal number");
    }
}
class Inte extends Decima
{
    void int_()
    {
        System.out.println("integer number");
    }
}
class city1  extends animalCar
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

public class Hybrid_2 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        Inte in=new Inte();
        in.int_();
        in.inte();
        in.dec();
        System.out.println("--------------------------------------------------------------------");
        city2 c=new city2();
        c.meth2();
        c.meth1();
    }
}
