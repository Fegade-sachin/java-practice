package arrays.PatternUsingArray;
/*
Prints an inverted and then upright right half
pyramid (like K shaped), forming a symmetrical star pattern.
******
*****
****
***
**
*
**
***
****
*****
******
 */
public class KPattern
{
    public static void main(String args[])
    {
        int n=6;
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
