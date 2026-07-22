package arrays.array_program_practice;
/*33.Transposing a matrix
Program to print the transpose of a given matrix.
 A transpose of a matrix has all its rows and columns interchanged. */
public class MatrixTransposeExample
{
    public static void main(String[] args)
    {
        int[][] matrix={
                {1,2,3,},
                {4,5,6},
                {7,8,9},
        };
        System.out.println("_____________Before sorting________________________");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] transpose=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
                for(int j=0;j<cols;j++)
                {
                   transpose[j][i]=matrix[i][j];
                }
        }
        System.out.println("________________________After sorting____________________");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
