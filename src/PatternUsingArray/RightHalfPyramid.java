package PatternUsingArray;
/*
12. Right Half Pyramid Pattern
This creates a right-angled triangle aligned to the left using stars.
*
**
***
****
*****
******
 */
public class RightHalfPyramid
{
    public static void main(String args[])
    {
        int n=6;
        for (int i=1;i<=n;i++ )
            {
            for (int j=1;j<=i;j++ )
                {
                    System.out.print("*");
                }
            System.out.println();
            }
    }
}
