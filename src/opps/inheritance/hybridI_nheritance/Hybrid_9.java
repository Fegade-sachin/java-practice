package opps.inheritance.hybridI_nheritance;
class vehicle
{
    void  run()
    {
        System.out.println("run");
    }
}
class auto extends vehicle
{
    void drive()
    {
        System.out.println("Drive Car");
    }
}
class Elecricbike  extends car
{
    void Start()
    {
        System.out.println("ElecricCar");
    }

}
class person extends vehicle
{
    void speak()
    {
        System.out.println("speak");
    }
}
class Employee extends person
{
    void work()
    {
        System.out.println("Work");
    }
}
class maneger extends Employee
{
    void manage()
    {
        System.out.println("Manage");
    }
}
public class Hybrid_9
{
    public static void main(String[] args) {
        Elecricbike obj1 = new Elecricbike();
        obj1.Start();
        obj1.drive();
        obj1.run();
        System.out.println("________________________End____________________________");
        maneger obj2 = new maneger();
        obj2.speak();
        obj2.work();


    }
}
