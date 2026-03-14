package PatternUsingArray;
/*Q 2. Number Triangle Pattern
Output :
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
6 6 6 6 6 6
*/
public class NumberTrianglePatter
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
        for(int k=1;k<=i;k++)
            {
            System.out.print(i+" ");
            }
         System.out.println();
     }
    }
}
//tc=O(n2) Sc=O(1)