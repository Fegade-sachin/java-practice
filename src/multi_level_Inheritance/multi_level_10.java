package multi_level_Inheritance;
class Animal
{
    void eat()
    {
        System.out.println("eat");
    }
}
class Mammal extends Animal
{
    void breathe()
    {
        System.out.println("Mammal breathe");
    }
}
class Dog extends Mammal
{
    void bark()
        {
        System.out.println("dog is  barking");
        }
}
public class multi_level_10
{
    public static void main(String[] args)
    {
        Dog a = new Dog();
        a.eat();
        a.breathe();
        a.bark();
    }
}
