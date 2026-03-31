package hierarchical_Inheritance;
class Animal
{
   void walk()
    {
        System.out.println("walk have different length");
    }
}
 class cat extends Animal
{
    void slow()
    {
        System.out.println("cat walk slowly");
    }
}
class Dog extends Animal
{
    void  walk_run()
    {
        System.out.println("walk_run() dog run very fast");
    }
}



public class hierarchicl_3
{
    public static void main(String[] args) {
        cat cobj=new cat();
        cobj.slow();
        cobj.walk();
        Dog obj=new Dog();
        obj.walk();
        obj.walk_run();
    }
}
