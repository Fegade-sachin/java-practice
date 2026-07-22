package arrays.array_program_practice;

/* 34. Printing all permutations of a string
Program to print all character arrangement permutations for any given string. */
public class StringPermutationsExample
{
    private static void permutations(String str,int left,int right)
    {
        if(left==right)
        {
            System.out.print(str+" ");
            return;
        }
        else
        {
            for(int i= left ; i<=right ; i++)
                {
                    str=swap(str, left ,i);
                    permutations(str,left+1,right);
                    str=swap(str,right,i);

                }
        }

    }
    public static String swap(String str,int i,int j)
    {
        char[] charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);

    }
    public static void main(String[] args)
    {
        String input="abc";
        System.out.println("Permutation of "+input+" ");
        permutations(input,0,input.length()-1);
    }


}
