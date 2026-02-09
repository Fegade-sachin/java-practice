package HybridI_nheritance;

class animalCar
{
    void display()
    {
        System.out.println("animalCar are two different types");
        System.out.println("Classified as fallow");
    }
}
class animal extends animalCar
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
}//multi level Inheritance
class car1 extends animalCar
{
    int a=10;
    void method1()
    {
        System.out.println("method1");
        System.out.println("a="+a);
        System.out.println("a="+a+a);
    }
}
class car2 extends car1
{
    int c=1;
    int a=10;
    int b=10;
    void  method2()
    {
        System.out.println("method2");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("a="+a+b);
        System.out.println("This is a addtion");
    }
}
public class hybrid_1
{
   public static void main(String[] args) {
        dog m =new dog();
        m.c1();
        m.meth1();
        m.d2();
        System.out.println("----------------------------------------------");

          car1 c=new car1();
        c.method1();
        car2 c2=new car2();
    }

}
