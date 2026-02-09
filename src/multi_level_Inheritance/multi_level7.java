package multi_level_Inheritance;

class Vehicle
{
    public void r1()
    {
        System.out.println("This is a Vehicle");
    }
}
class twoWheelerVehicle extends Vehicle
{
    public void r2()
    {
        System.out.println("This is a twoWheelerVehicle run");
    }
}
class bikeVehicle extends twoWheelerVehicle
{
    public void r3()
    {
        System.out.println("This is a bikeVehicle run");
    }
}
public class multi_level7
{
    public static void main(String[] args)
    {
        bikeVehicle vehicle = new bikeVehicle();
        vehicle.r1();
        vehicle.r2();
        vehicle.r3();

    }
}
