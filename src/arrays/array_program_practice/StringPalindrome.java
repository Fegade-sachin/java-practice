package arrays.array_program_practice;

public class StringPalindrome
{
  public static void main(String args[])
  {
    String str1="madam";
    int first=0;
    int last=str1.length()-1;
   boolean flag=true;
    while(first!=last)
    {
        if(str1.charAt(first)!=str1.charAt(last)) {
            flag = false;
            break;
        }
        first++;
        last--;


    }

    if(flag==true)
    {
      System.out.println("the string is palindrome");
    }
    else
    {
      System.out.println("the string is not palindrome");
    }
  }
}
