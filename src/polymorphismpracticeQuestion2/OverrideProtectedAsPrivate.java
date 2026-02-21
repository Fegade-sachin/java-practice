package polymorphismpracticeQuestion2;
//13) Can we override protected method as private?
class protectedMethod
{
    protected void  show() //
    {
        System.out.println("protected show method ");
    }
}
public class OverrideProtectedAsPrivate
{
    //@Override  No we cannot override protected method as private.
    private void show()//private method only accessible only with in the class method hiding will be happen
    {
        System.out.println("private show method ");
    }
}
