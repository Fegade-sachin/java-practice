package PatternUsingArray;
/*
 Prints a pyramid where numbers increase continuously from top to bottom.
 put
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
    16 17 18 19 20 21
 */
public class NumberChangingPyramidPattern
{
    public static void main(String[] args) {
        int n = 6;
        int num=1;
        int[] arr = new int[n];
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <i; j++)
            {
                System.out.print(num + " ");

                num++;
            }
            System.out.println();
        }
    }
}
