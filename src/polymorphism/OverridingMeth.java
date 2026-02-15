package polymorphism;
class Polymorph
{
    void method()
    {
        System.out.println(" Polymorph class method called");
        int a=01;
        System.out.println(a);
    }
}
public class OverridingMeth extends Polymorph
{
    @Override
    void method()
    {
      System.out.println(" OverridingMeth class method called");
      int a=11;
      System.out.println(a);
    }

    public static void main(String[] args) {
        OverridingMeth obj = new OverridingMeth();
        obj.method();
    }
}
