package opps.polymorphism.ex_polymorphism;
/*
    2) In a class, one method has two overloaded forms.
    One form is defined as static and another form is defined as non-static. Is that method properly overloaded?
    And: properly overloaded
 */
public class OverloadExample
{
    public  void m1()
    {
        System.out.println(" non static method m1()");
    }
     static public void m1(int a)
    {
        System.out.println(" static method  m1() ==>"+ a+a);
    }

    public static void main(String[] args) {
        OverloadExample m = new OverloadExample();
        m.m1();
        m.m1(56);
    }
}
