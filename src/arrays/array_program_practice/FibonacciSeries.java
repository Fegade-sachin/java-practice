package arrays.array_program_practice;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        int a=0,b=1;
       int c=0;
       int n=7;
        System.out.print(a+" "+b+" ");
        n=n-2;
        while(n!=0) {
           c = a + b;
           System.out.print(c+" ");

           a = b;
           b = c;
           n--;
       }


    }
}
