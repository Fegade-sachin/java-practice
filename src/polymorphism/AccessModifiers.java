package polymorphism;
class predefined
{
     void display()//Access modifier connote more restricted that parent class
    {
        System.out.println("predefined display method");
    }
    protected void show()
    {
        System.out.println("predefined display method");
    }
    public void Catch()
    {
        System.out.println("predefined Catch method");
    }
}
public class AccessModifiers extends predefined
{
    @Override
   protected void display() //default ,protected ,public access modifier can be use
    {
        System.out.println("AccessModifiers display method ");
    }
    @Override
    protected void show()//default ,protected ,public access modifier can be use
    {
        System.out.println("AccessModifiers display method ");
    }
    @Override
    public void  Catch()
    {
        System.out.println("AccessModifiers Catch method ");
    }
    public static void main(String[] args)
    {
        AccessModifiers am = new AccessModifiers();
        am.display();
        am.show();
        am.Catch();

    }

}
