package arrays.PatternUsingArray;

import java.util.Scanner;

/*
17. Reverse Number Triangle Pattern
A reverse right-aligned triangle with ascending numbers from i to n.
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
 */
public class ReverseNumTranglePaern
{
    public static void main(String args[])
    {
        int n=6;
        for(int j=1;j<=6;j++)
        {
            for(int j1=1;j1<=j;j1++)
                {
                System.out.print(" ");
                }
            for(int k=j;k<=n;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
