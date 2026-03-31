package abstraction;
class parent
{
    void show()
    {
        System.out.println("parent class not abstract class");
    }
}
abstract class child extends parent
{
    //show method does not need to provide implementation from child class
   void display()//normal method
    {
        System.out.println("child class method");
    }
     abstract void AbstractMethK();
}
public class  Subchild  extends child
{
    void AbstractMethK()//providing implementation for the abstract class which is present in child class
    {
        System.out.println("child class method called in NormalParent class  ");
    }
    public static void main(String[] args)
    {
        child obj=new Subchild();//reference of child class object subchild class
        obj.display();//normal method of concrete class
        obj.AbstractMethK();//abstract class abstract method
        obj.show();//normal parent class method
    }
 }

