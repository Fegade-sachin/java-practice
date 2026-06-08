package array_program_practice;

public class PrimeNumber
{
    public static void main(String[] args)
    {
      int n=1;
      boolean flag=false;
      if(n<=1)
      {
          System.out.println("it is not prime number");
          return;
      }
      else
      {
          for(int i=2;i<=n/2;i++)
          {
              if(n%i==0)
              {
                  flag=true;
                  break;
              }
          }
      }

      if(flag==false)
      {
          System.out.println("Prime Number");
      }
      else
      {
          System.out.println("Not Prime Number");
      }

    }
}
