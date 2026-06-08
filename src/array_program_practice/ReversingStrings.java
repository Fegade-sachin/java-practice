package array_program_practice;

public class ReversingStrings
{
    public static void main(String[] args) {
        String str1 = "java is awesome";
        StringBuilder str2 = new StringBuilder();
        for (int i =str1.length()-1;i>0;i--) {
           str2.append(str1.charAt(i));
        }
        System.out.println(str2);
    }
//    tc=O(n)
//    Sc=O(n)
}
