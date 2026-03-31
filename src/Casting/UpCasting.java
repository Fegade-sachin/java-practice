package Casting;
class parent
{
    void  display()
    {
        System.out.println("display parent class method");
    }
}
class child extends parent
{
     void Display()
    {
     System.out.println("display child class method");
    }
}
public class UpCasting
{
  public static void main(String[] args)
  {
      child c=new child(); // - This is normal object creation, not casting.


      c.display();

      parent p = new child();  // this is upcasting
      p.display();             // calls parent’s method
  }
}
