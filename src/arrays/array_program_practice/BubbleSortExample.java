package arrays.array_program_practice;
/* 32. Performing bubble sort
Program to sort a given array using the bubble sort algorithm. */

public class BubbleSortExample
{
    public static void main(String[] args)
    {
        int  arr[]={2,4,6,9,3,2,1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
