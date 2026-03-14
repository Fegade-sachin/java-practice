package PatternUsingArray;
/*Q7 Prints a triangle with mirrored numbers forming a palindrome on each row.
         1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6
 */
public class PalindromeTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >=1; k--) {
                System.out.print(k + " ");
            }
            System.out.print("");
            for (int l =2 ; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}

