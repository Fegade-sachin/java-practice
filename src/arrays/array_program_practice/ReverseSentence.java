package arrays.array_program_practice;

/*
15. Reversing the order of words in a sentence
Program to reverse the order of words in any given setence.
*/

public class ReverseSentence
{
	public static void main(String[] args)
	{
        String sentence = "I Love Java Programming";
        String revWord[]=sentence.split(" ");
        int n=revWord.length;
        int left=0,right=n-1;
        while(left<right)
        {
            String temp=revWord[left];
            revWord[left]=revWord[right];
            revWord[right]=temp;
            left++;
            right--;
        }
        for (String word:revWord)
            {
            System.out.print(word+" ");
            }
    }
}
