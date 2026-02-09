package Hierarchical_Inheritance;

class mobile
{
    void company()
{
    System.out.println("mobile");
}
}
class onepluse extends mobile
{
    void c2()
{
    System.out.println("onepluse c2 is one of the model of mobile");
}
}
class iphone extends mobile
{
    void p17row_max()
{
    System.out.println("iphone");
}
}
public class hierarchicl_1
{
    public static void main(String[] args) {


  onepluse one = new onepluse();
  one.c2();
    one.company();
  iphone iph = new iphone();
  iph.p17row_max();
    }
}
