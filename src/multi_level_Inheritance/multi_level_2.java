package multi_level_Inheritance;
class vehicle
{
    void cycle()
    {
        System.out.println("has two wheels");
    }
}
class four_wheeler extends vehicle
{
    void car()
    {
        System.out.println("four wheels");
    }
}
class two_wheeler extends four_wheeler
{
    void bike()
    {
    System.out.println("two wheeler");
    }
}
public class multi_level_2
{
    public static void main(String[] args)
    {
       two_wheeler tobj= new two_wheeler();
       tobj.cycle();
       tobj.bike();
       tobj.car();
    }
}
