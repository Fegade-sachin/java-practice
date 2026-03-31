package hierarchical_Inheritance;

class Appliance
{
   void powerOn()
    {
        System.out.println("Appliance");
    }
}
class WashingMachine extends Appliance
{
   void clock()
    {
        System.out.println("WashingMachine");
    }
}
class Refrigerator extends Appliance
{
    void  cool()
    {
        System.out.println("Refrigerator");
    }
}
public class hierarchicl_10
{
    public static void main(String[] args)
    {
        Refrigerator r = new Refrigerator();
        r.cool();
        r.powerOn();
        WashingMachine w = new WashingMachine();
        w.clock();
        w.powerOn();

    }
}
