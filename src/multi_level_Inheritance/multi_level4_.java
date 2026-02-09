package multi_level_Inheritance;

class Decima
{
    void dec()
        {
        System.out.println("decimal number");
        }
}
class Inte extends Decima
{
    void int_()
        {
        System.out.println("integer number");
        }
}
class Stri extends Inte
{
    void str()
        {
        System.out.println("string number");
        }
}
public class multi_level4_
{
    public static void main(String[] args)
    {
        Stri s = new Stri();
        s.int_();
        s.str();
        s.dec();
    }
}
