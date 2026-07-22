package arrays.array_program_practice;

public class FirstUniqueCharacter
{
    public static void main(String[] args)
    {
        String str = "aabbcdde";
        int frq[]=new int[256];
        for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
            frq[ch]++;
            }
        for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(frq[ch]==1)
                {
                    System.out.println("first unique :"+ch);
                    break;
                }
            }
    }
}
