package arrays.array_program_practice;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int num=153;
        int temp=num;
        int count=0;
        int sum=0;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
       temp=num;
        while(temp!=0)
        {
            int digit=temp%10;
            int power=1;
            for(int i=0;i<count;i++)
            {
                power=power*digit;
            }
            sum=sum+power;
            temp=temp/10 ;
        }

        if(sum==num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
