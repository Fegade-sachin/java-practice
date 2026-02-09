package multi_level_Inheritance;
class vehicle2
{
    public void start()
    {
        System.out.println("vehicale start");
    }
    public void drive()
    {
        System.out.println("vehicle drive");
    }
}
class HeavyVehicle extends vehicle2
{
    public void load()
    {
        System.out.println("Heavy vehicle  carys have been loaded");
    }
}
class bus extends HeavyVehicle
{
    public void travel()
    {
        System.out.println("bus is traveling with passengers");
    }
}
public class multi_level8
{
    public static void main(String[] args)
    {
        bus bs=new bus();
        bs.start();
        bs.drive();
        bs.load();
        bs.travel();
    }
}
