package polymorphismpracticeQuestion3;

//24) What will be the output of the following program?
class ClassOne
{
    void method(String s1)
    {
        method(s1, s1+s1);//JAVA ,JAVAJAVA
    }

    void method(String s1, String s2)
    {
        method(s1, s2, s1+s2);//JAVAJAVAJAVAJAVAJAVAJAVA
    }

    void method(String s1, String s2, String s3)
    {
        System.out.println(s1+s2+s3);//JAVAJAVAJAVAJAVAJAVAJAVA
    }
}

public class MainClass3
{
    public static void main(String[] args)
    {
        ClassOne one = new ClassOne();

        one.method("JAVA");//output: JAVAJAVAJAVAJAVAJAVAJAVA
    }
}