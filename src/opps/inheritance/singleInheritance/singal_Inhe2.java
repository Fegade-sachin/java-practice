package opps.inheritance.singleInheritance;

class animal
{
    void merth1()
    {
        int a= 6;
        a+=17;
        System.out.println("Merth 1 Ex2 of single inheritance");
        System.out.println("hii");
        System.out.println(4 * 5);

    }
}
    class dog extends animal
    {
        void merth2()
        {
            System.out.println("Merth 2 of single inheritance");
            System.out.println("hello");
            System.out.println("_______________________________________________________________");
        }
    }

public class singal_Inhe2
{
    public static void main(String[] args)
    {
       dog d=new dog();
       d.merth1();
       d.merth2();
    }
}
