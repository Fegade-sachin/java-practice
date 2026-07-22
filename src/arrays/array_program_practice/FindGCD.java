package arrays.array_program_practice;

public class FindGCD
{
    public static void main(String[] args)
    {
        int a=20;
        int b=28;
        while(b!=0)
        {
            int tem=b;
            b=a%b;
            a=tem;
        }
        System.out.println("GCD of 20 and 28  ="+ a);
    }
}
