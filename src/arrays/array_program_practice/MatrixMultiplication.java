package arrays.array_program_practice;
/*37  Multiplying matrices
Program to multiply any two given matrices and print the result.
*/

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] multiResult = new int[3][3];
            for(int i = 0; i < matrix1.length; i++)
            {
                for(int j = 0; j < matrix1[i].length; j++)
                {
                    multiResult[i][j] =0;
                    for ( int k = 0; k < matrix1[i].length; k++ )
                        {
                        multiResult[i][j] += matrix1[i][k]*matrix2[k][j];
                        }
                }
            }
            for (int i = 0; i < multiResult.length; i++)
            {
                for ( int k = 0; k < multiResult[i].length; k++ ) {
                    System.out.print(multiResult[i][k] + " ");
                }
                System.out.println();



        }
    }
}
