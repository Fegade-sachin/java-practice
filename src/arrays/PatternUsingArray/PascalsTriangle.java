package arrays.PatternUsingArray;
/*
    Generates Pascal’s Triangle with proper alignment, showing binomial coefficients for each row.
    1
   1 1
  1 2 1
 1 3 3 1
 */
public class PascalsTriangle
{
    public static void main(String[] args)
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int x=1;
            for(int k=1;k<=i;k++)
            {
                System.out.print(x+" ");
                x=x*(i-k)/k;
            }
            System.out.println();
        }
    }
}
