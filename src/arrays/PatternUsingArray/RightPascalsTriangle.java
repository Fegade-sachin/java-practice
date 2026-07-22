package arrays.PatternUsingArray;
/*
24. Right Pascal’s Triangle
Forms a right-angled triangle pointing upward and downward, creating a right Pascal’s triangle shape.
*
* *
* * *
* * * *
* * *
* *
*
 */

public class RightPascalsTriangle
{
    public static void main(String args[])
    {
       int n=4;
       for(int j=1;j<=n;j++)
           {
            for(int j1=1;j1<=j;j1++)
                {
                System.out.print("*"+(" ")) ;
                }
                System.out.println();
           }
       for(int i=n-1;i>0;i--)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*"+(" ")) ;
           }
           System.out.println();
       }
    }
}
