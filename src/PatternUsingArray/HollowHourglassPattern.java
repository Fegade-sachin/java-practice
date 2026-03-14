package PatternUsingArray;
/*
 Displays a hollow hourglass using stars,
 where only boundary stars are visible in a symmetric hourglass shape.
     * * * * * *
     *       *
      *     *
       *   *
        * *
         *
        * *
       *   *
      *     *
     *       *
    * * * * * *
 */
public class HollowHourglassPattern
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++)
            {
                if(k==i ||k==n||i==1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<i;j++)
                {
                System.out.print(" ");
                }
            for(int k=i;k<=n;k++)
            {
                if(k==i||k==n||i==1) {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
