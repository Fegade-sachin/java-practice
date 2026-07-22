package opps.inheritance.hierarchical_Inheritance;
class fruit
{
    void eat()
    {
        System.out.println(" eat fruit");
    }
}
class mango extends fruit
{
    void orange()
    {
        System.out.println(" Orange mango");
    }
}
class apples extends fruit
{
    void pnik()
    {
        System.out.println(" sleep");
    }
}

public class hierarchicl_2 
{
    public static void main(String[] args) {
        apples a = new apples();
        a.eat();
        System.out.println("____________________________________");
        mango b = new mango();
        b.orange();
    }
}
