package arrays.array_program_practice;
/*
13. Finding the square root of a number
Program to print a given number's square root without employing the math.sqrt() function.
*/
public class SimpleSquareRoot
{
    public static void main(String[] args) {


        int num = 36;
        int sqr = 0;
        {
            for (int i = 0; i < num; i++) {
                if (i * i == num)
                    sqr = i;
            }
            System.out.println(sqr);
        }
    }
}
