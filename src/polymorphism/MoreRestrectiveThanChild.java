package polymorphism;
abstract class  ReParentClass
{
    void  display()
    {
        System.out.println("Child Class");
    }
  protected abstract void meth1();
}
public class MoreRestrectiveThanChild extends ReParentClass
{
   protected void meth1()
    {
        System.out.println("Child Class");
    }
    public static void main(String[] args)
    {
        new MoreRestrectiveThanChild().display();
    }

}
