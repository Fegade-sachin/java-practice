package array_program_practice;
/*14. Reversing an array in place
Program to reverse the order of elements in a string,
integer or character array.Related: How Much Do Java Developers Make? (With Salaries And Tips)*/
public class ReverseArray
{
   static void ReverseStringArray()
    {
        String[] words = {"I", "Love", "Java"};
                int n=words.length;
            int left=0,right=n-1;
            while (left<right)
            {
                String temp=words[left];
                words[left]=words[right];
                words[right]=temp;
                left++;right--;
            }
            for(String i:words)
            {
                System.out.println(i);
            }
    }
    public static void main(String[] args)
    {
        ReverseStringArray();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left != right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
