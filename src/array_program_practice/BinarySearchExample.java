package array_program_practice;
/*17. Performing binary search
Program to perform binary search for a given character/integer within a sorted array.
 In a binary search, the search interval is repeatedly divided into half with every iteration.*/
public class BinarySearchExample
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        while(start <= end)
        {
            int mid = (end - start) / 2;
            if(arr[mid] == target)
            {
               System.out.println("found at Index "+mid);
                found=true;
               break;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        if(!found)
        {
            System.out.println("not found");
        }
    }
}
