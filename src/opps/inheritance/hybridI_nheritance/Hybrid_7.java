package opps.inheritance.hybridI_nheritance;
class Education
{
    public void r1()
    {
        System.out.println("This is a education");
    }
}
class collage extends Education
{
    public void r2()
    {
        System.out.println("This is a Collage");
    }
}
class School extends collage
{
    public void r3()
    {
        System.out.println("This is a school");
    }
}
class  Clothes extends Education
{
     void shirt()
    {
        System.out.println("This is a Clothes");
        System.out.println("wearing clothes:");
    }
}
class dressing extends Clothes
{
    public void dress()
    {
        System.out.println("This is a dressing");
        System.out.println(" dressing is good be comfortable:");

    }
}
public class Hybrid_7
{
    public static void main(String[] args) {


        dressing obj = new dressing();
        obj.dress();
        obj.shirt();
        System.out.println("________________________________________________");
        School  obj1 = new School();
        obj1.r1();
        obj1.r2();
        obj1.r3();

    }
}
