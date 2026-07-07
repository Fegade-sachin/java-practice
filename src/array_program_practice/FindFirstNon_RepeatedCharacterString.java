package array_program_practice;

public class FindFirstNon_RepeatedCharacterString
{
        public static void main(String[] args) {

            String Input="aabbcdde";
            int[] freq=new int[256];
            for(int i=0;i<Input.length();i++)
            {
                char ch=Input.charAt(i);
                freq[ch]++;
            }
            for (int i=0;i<Input.length();i++)
            {
                char ch=Input.charAt(i);
                if(freq[ch]==1)
                {
                    System.out.println(ch);
                    break;
                }
            }
        }
    }
/*
tc O(n)
    Sc O(1)
    i traverse array once and cout its frequency and then traverse array and print that element that found once and break for look*/


