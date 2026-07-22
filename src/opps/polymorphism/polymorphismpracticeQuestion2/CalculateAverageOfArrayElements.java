package opps.polymorphism.polymorphismpracticeQuestion2;
/*
4. Calculate average of array elements

Write a Java program to calculate the average value of array elements.
 */
public class CalculateAverageOfArrayElements
{
    public static void main(String[] args)
    {
        int arr[]={12,32,56,42,11,68,25};
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            avg+=sum/arr.length;
        }
        avg=avg/arr.length;
        System.out.println("The average is ==> "+avg);
    }
}
