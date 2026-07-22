package arrays.array_program_practice;
/*16. Checking if a string contains a substring
Program to determine whether a given substring exists within another string.
This involves searching the main string to find the exact sequence of characters in the substring.*/
public class SubstringCheck
{
    public static void main(String[] args)
    {
        String mainStr = "I love Java programming";
        String subStr = "Java";
        if(mainStr.contains(subStr))
            {
            System.out.println("Substring Match");
            }
        else
        {
            System.out.println("Substring Not Match");
        }
    }
}
