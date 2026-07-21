package java8.practice;
//Use Optional to safely handle a null string.
import java.util.Optional;
public class UsingOptionalNullString
{
    public static void main(String[] args) {
        String name= null;
                Optional optionalName=Optional.ofNullable(name);
                System.out.println("Value of OptionalName is "+optionalName);
                optionalName.ifPresentOrElse(
                        val->System.out.println("value is "+ val),
                        ()->System.out.println("value is null")
                );
                Object safeName=optionalName.orElse("Default Name ");
                System.out.println("Safe Name optional"+safeName);



    }
}
