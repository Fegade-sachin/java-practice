package five_main_ways_create_objcet;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorReflectionAPI
{
    void meth()
    {
    System.out.println("meth");
    }
    public static void main(String[] args) throws Exception
    {
        Constructor<ConstructorReflectionAPI> cons =
                ConstructorReflectionAPI.class.getConstructor();

        ConstructorReflectionAPI obj = cons.newInstance();
        obj.meth();

 /*
      if have one or more constructor
      // Get all public constructors
        Constructor<?>[] consArray = ConstructorReflectionAPI.class.getConstructors();

        // Pick the first one (since there's only the default no-arg constructor here)
        Constructor<?> cons = consArray[0];

        // Create a new instance
        ConstructorReflectionAPI obj = (ConstructorReflectionAPI) cons.newInstance();

        obj.meth();*/

    }
}
