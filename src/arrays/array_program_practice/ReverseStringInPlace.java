package arrays.array_program_practice;
/*35. Reversing a string in place
Program to reverse the order of characters in any given string.
But, the reversing has to be done in place, meaning the solution
is not required to involve creating a duplicate string for reversal.*/
public class ReverseStringInPlace
{
    public static void main(String[] args) {
         String str="hello";
         System.out.println("Original String : "+str);
         int left=0,right=str.length()-1;
          char[] chars =str.toCharArray();
         while(left<=right){
             char temp=chars[left];
             chars[left]=chars[right];
             chars[right]=temp;
             left++;
             right--;
         }
         System.out.println("Reverse String : "+new String(chars));
    }
}
