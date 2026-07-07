package java8.optionalClass;

import java.util.Optional;

public class Optional_ifPresentMethod
{
    public static void main(String[] args)
    {

        Optional<String> optional = Optional.ofNullable("someValue");
        optional.ifPresent(value -> System.out.println(value));

    }
}
