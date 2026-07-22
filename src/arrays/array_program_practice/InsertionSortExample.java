package arrays.array_program_practice;
//31. Performing insertion sort
//Program to sort a given array using the insertion sort algorithm.
import java.util.Arrays;

public class InsertionSortExample
{
    public static void main(String[] args) {
        int arr[]={1,2,4,8,9,5,3};
        for (int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>=key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
