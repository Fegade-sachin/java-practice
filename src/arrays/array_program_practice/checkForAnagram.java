package arrays.array_program_practice;

import java.util.Arrays;

public class checkForAnagram
{
    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(str1.length()!=str2.length())
        {
            System.out.println("lengths are not equal it is not anagram ");
            return;
        }
        if(Arrays.equals(s1,s2))
        {
            System.out.println("Anagram found");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}
