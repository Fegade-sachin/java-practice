package Hierarchical_Inheritance;
class shape
{
    void draw()
    {
        System.out.println("draw have different length ,it has different shape");
    }
}
class circle extends shape
{
    void area()
    {
        System.out.println("draw have different length in circle");
    }
}
class rectangle extends shape
{
    void area()
    {
        System.out.println("draw have different length");
    }
}
public class hierarchicl_5
{
    public static void main(String[] args) {


    rectangle re = new rectangle();
    re.draw();
    re.area();
    circle c = new circle();
    c.draw();
    c.area();
    }
}
