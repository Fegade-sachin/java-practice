package polymorphismpracticeQuestion3;
//29) Can we access super class version of overridden method in the sub class. If yes, how?
class paren
{
  public paren()//constructor c
  {
      System.out.println("paren Parent constructor");
  }
}
public class ParentConstructorAccess
{
    ParentConstructorAccess()
    {
        System.out.println("ParentConstructerAccess constructor");
    }

    public static void main(String[] args) {
        ParentConstructorAccess obj = new ParentConstructorAccess();
    }
}
