package arrays.PatternUsingArray;
/*Q8 Prints a rhombus (tilted square) made of stars, shifted by spaces.Prints a rhombus (tilted square) made of stars, shifted by spaces.
         ******
       ******
     ******
   ******
 ******
 ******
 */

public class RhombusPattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <=n; j++)
            {
               System.out.print(" ");
            }

            for(int j = 1; j <=n; j++)
            {
                System.out.print("*");
            }

                System.out.println();
        }
    }

}
