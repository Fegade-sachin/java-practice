package polymorphism;
class ParentClass
{
    static void display()
        {
            System.out.println(66+77);
             System.out.println("parentClass display method");
        }
         private void method()
        {
            System.out.println("parentClass display method");
        }



}
public class OverrideingNotMethodHiding
{
    static void  display()//not Overriding method hiding
        {
            System.out.println(23+11);
            System.out.println("OverrideingNotMethodHiding display method");
        }
       // @Override it is not overridden it is method hiding here
         void  method()
        {
            System.out.println("parentOverrideingNotMethodHidingClass display method");
        }
}
