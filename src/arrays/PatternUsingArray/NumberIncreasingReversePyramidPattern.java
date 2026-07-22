package arrays.PatternUsingArray;
//Q 4.  This is a reverse pyramid where each row starts from 1 and ends at the row count,
// in decreasing number of elements.
/*      1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1 */
public class NumberIncreasingReversePyramidPattern
{
    public static void main(String[] args)
    {
        int  n=6;
        for(int i = 6; i >=1; i--)
        {
            for (int j = 1; j <=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
