package five_main_ways_create_objcet;

public class Using_Class_forName
{
    void meth1()
    {
        System.out.println(" object created using  forName method");
    }
    public static void main(String[] args)
    {
        try
        {
            //Reflection internally but still constant steps
            Using_Class_forName obj=(Using_Class_forName)Class .forName("five_main_ways_create_objcet.Using_Class_forName").getDeclaredConstructor()
                    .newInstance();// use
           //  deprecated in modern Java//.newInstance();
            obj.meth1();
        }
        catch (Exception e)
        {

        }

    }
}
