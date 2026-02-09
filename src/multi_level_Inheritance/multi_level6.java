package multi_level_Inheritance;
class vehicle1
{
    void  run()
    {
        System.out.println("run");
    }
}
class car extends vehicle1
{
    void drive()
    {
        System.out.println("Drive Car");
    }
}
class ElecricCar  extends car
{
    void Start()
        {
        System.out.println("ElecricCar");
        }

}

public class multi_level6
{
    public static void main(String[] args)
    {
        ElecricCar elecricCar = new ElecricCar();
        elecricCar.run();
        elecricCar.drive();
        elecricCar.Start();
    }
}
