package PatternUsingArray;
/*
Prints a symmetrical hollow diamond made of stars, with spaces in the middle and stars only at the borders.
     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *
 */
public class HollowDiamondPyramid
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++)
                {
                   if(j==1||j==2*i-1)
                   {
                       System.out.print("*");
                   }
                   else
                   {
                       System.out.print(" ");
                   }
                }
                System.out.println();
            }
        for(int i=n-1;i>=1;i--)
            {
                for(int j=n-1;j>=i;j--)
                {
                    System.out.print(" ");
                }
                    for(int j=(2*i-1);j>=1;j--)
                        {
                        if(j==1||j==2*i-1)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
            }
    }
}
