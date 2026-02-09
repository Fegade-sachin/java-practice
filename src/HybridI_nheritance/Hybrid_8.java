package HybridI_nheritance;
class smartPhone
{
    void mobile()
    {
        System.out.println("mobile");
        System.out.println("is one of the example oppo mobile");
    }
}
 class smartTv extends smartPhone
 {
     void miTv()
     {
         System.out.println("miTv");
         System.out.println("is one of the example Mi tv");
     }
 }
 class smartEmail  extends smartTv
 {
     void email()
     {
         System.out.println("email");
     }
 }
 class Androd extends smartPhone
 {
     void  onepluse()
     {
         System.out.println("Androd Phone");

     }
 }
 class iPhone extends Androd
 {
     void Apple()
     {
         System.out.println("iPhone Phone");

     }
 }


public class Hybrid_8
{
    public static void main(String[] args) {

        smartEmail  obj1 = new smartEmail();
       obj1.mobile();
       obj1.email();
       obj1.miTv();
       System.out.println("_______________________________________________________________________");
       iPhone obj2 = new iPhone();
       obj2.Apple();
       obj2.onepluse();
    }
}
