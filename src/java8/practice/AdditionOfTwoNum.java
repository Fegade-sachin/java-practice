package java8.practice;
//Write a program using a lambda expression to add two numbers.
interface Addition
{
    int add(int a,int b);

}
public class AdditionOfTwoNum
{
    public static void main(String[] args) {
        Addition x  =(a,b)->( a + b);
      int  result=x.add(22,33);
      System.out.println(result);
    }
}
