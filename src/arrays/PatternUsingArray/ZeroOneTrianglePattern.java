package arrays.PatternUsingArray;
/*
Q1.Prints a triangle where each number alternates between 1 and 0 based on the position.
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
*/
public class ZeroOneTrianglePattern
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i = 1; i <=n; i++)
            {
                for(int j = 1; j <=i; j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print(1 + " ");
                    }
                    else
                        {
                        System.out.print(0 + " ");
                        }
                }
                System.out.println();
            }
    }
}
