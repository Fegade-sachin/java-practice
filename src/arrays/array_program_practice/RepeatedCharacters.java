package arrays.array_program_practice;

public class RepeatedCharacters

{
	public static void main(String[] args)
	{
        String str1 ="programming";
        int freq[]=new int[256];
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<256;i++)
        {

            if(freq[i]>1)
            {
                System.out.println((char)i+" "+freq[i]);
            }
        }
    }
}
