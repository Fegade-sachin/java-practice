package arrays.PatternUsingArray;
/*
13. Reverse Right Half Pyramid Pattern
This prints a right-aligned triangle but in reverse top to bottom.
******
*****
****
***
**
*
 */
public class ReverseRightHalfPyramid
{
    public static void main(String args[])
    {
        int n=6;
        for(int i=n;i>=1;i--)
            {
                for(int j=i;j>=1;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
