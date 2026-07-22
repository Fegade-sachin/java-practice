package opps.polymorphism.polymorphismpracticeQuestion3;
//29) Can we access super class version of overridden method in the sub class. If yes, how?
class paren
{
  public paren()//constructor c
  {
      System.out.println("paren Parent constructor");

  }
    void show()
    {
        System.out.println("show Parent method");
    }
}
public class ParentConstructorAccess extends paren
{
    ParentConstructorAccess()
    {
        System.out.println("Parent Constructor Access constructor");
    }
    void show()
    {
        System.out.println("show CHILD method");
    }
    void display()
    {
        System.out.println("display CHILD method");
    }

    public static void main(String[] args)
    {
        paren obj = new ParentConstructorAccess();
        obj.show();
        ParentConstructorAccess c= (ParentConstructorAccess) obj;
        c.display(); // with the help of parent reference into a child we can call child specific method.

    }
}
