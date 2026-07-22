package arrays.array_program_practice;
/*20. Reversing a number
Program to print any given number with the digits in reverse order.*/
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed number is " + rev);
    }
}
