package multi_level_Inheritance;
class  A
{
    String name;
    int age;

    void print1()
    {
        name="sachin";
        age=10;
        System.out.println(name);
        System.out.println(age);
    }

}
class B extends A
{
    void  show()
    {

        System.out.println("java is awesome");
        System.out.println("COOL");

    }
}
class C extends B
{
    void  display1()
    {
        System.out.println("java is awesome");
        System.out.println("do you like c");
    }
}
public class multi_level5
{
    public static void main(String[] args)
    {
       C c=new C();
       c.print1();
       c.show();
       c.display1();
    }
}
