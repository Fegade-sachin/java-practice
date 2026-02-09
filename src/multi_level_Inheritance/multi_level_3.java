package multi_level_Inheritance;
class WildAnimal
{
    void walk()
    {
        System.out.println("animal");
    }
}

class  cow extends WildAnimal
{
    void  fly()
    {
        System.out.println("milk");
    }
}
class oX extends cow
{
    void eat()
    {
        System.out.println("work");
    }
}

public class multi_level_3
{
    public static void main(String[] args)
    {
        oX a = new oX();
        a.eat();
        a.fly();
        a.walk();
    }
}
