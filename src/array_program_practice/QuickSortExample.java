package array_program_practice;
//30. Sorting an array using quick-sort
//Program to sort a given array of integers using the quick-sort algorithm
public class QuickSortExample
{
   public static void quicksort(int [] arr,int low,int high)
   {
        if(low<high)
        {
            int pi= partation(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);

        }
    }

    private static int partation(int[] arr, int low, int high)
    {
        int pi = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
            {
            if(arr[j]<pi)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
            }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    public static void main(String[] args)
    {
        int arr[]={12,4,6,44,6,63,67,88};
        System.out.println("before sort");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        int low=0,high=arr.length-1;
        quicksort(arr,low,high);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
