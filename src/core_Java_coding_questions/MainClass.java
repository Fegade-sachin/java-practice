package core_Java_coding_questions;
public class MainClass
{
    static int i = 1;

    static
    {
        i = i-- + --i;//-1
        System.out.println(i);
    }

    {
        i = i++ - ++i;//-1=1-1
        System.out.println(i);
    }

    int methodOfTest()
    {
       return i + i - i * i / i;//

    }

    public static void main(String[] args)
    {
        System.out.println(new MainClass().methodOfTest());
    }
}