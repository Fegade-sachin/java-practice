package opps.polymorphism.ex_polymorphism;
class parentClass
{
   void display()
        {
        System.out.println("parentClass display method");
        }
    void show()
        {
        System.out.println("parentClass show method");
        }
}
 class ChildClass extends parentClass
{
   //does not contain any method  parent method will be initialized
}
public class RunTimePolymorphism extends  ChildClass
{
    void show()
        {
        System.out.println(" RunTimePolymorphism show method called");
        }
    void display()
    {
        System.out.println("child class display method");
    }
    public static void main(String[] args)
    {
        RunTimePolymorphism rp=new RunTimePolymorphism();//child class object child class reference
        rp.show();// RunTimePolymorphism this class show method called this is method Overriding
        rp.display();
        ChildClass cs=new ChildClass();//child class object child class reference
        cs.show();// childClass  don't have show method that's why parent show method called
        cs.display(); //childClass  don't have display method that's why parent display method called
    }
}
