package java8.practice;

import java.util.Arrays;
import java.util.function.Function;

//Use Function to square numbers.
public class UsingFunctionSquareNum
{
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x * x;
        int[]arr={2,3,4,5,6,9};
      for(int num:arr)
      {
          int result = f.apply(num);
          System.out.println("number "+num+" and result "+result);
      }
    }
}
