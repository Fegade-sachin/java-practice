package Hierarchical_Inheritance;
class vehicle
{
    void Speed()
    {
        System.out.println("Speed");
    }
}
class Car extends vehicle
{
    void drive  ()
    {
        System.out.println("Speed up very quickly");
    }
}
class Bike extends vehicle
{
    void ride()
    {
        System.out.println("Bike is fast");
    }
}
public class hierarchicl_9
{
    public static void main(String[] args) {


    Car c = new Car();
    c.Speed();
    c.drive();
    Bike b = new Bike();
    b.ride();
    b.Speed();

    }
}
