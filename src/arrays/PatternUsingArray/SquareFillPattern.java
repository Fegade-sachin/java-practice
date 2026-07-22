package arrays.PatternUsingArray;
//This program prints a filled square of stars (*) with n+1 rows and columns.
public class SquareFillPattern
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
