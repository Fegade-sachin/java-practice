package java8.optionalClass;

import java.util.Optional;

public class Optional_isPresentMethod
{


        public static void main(String[] args) {
            Optional<String> optional = Optional.ofNullable("someValue");

            if (optional.isPresent()) {
                System.out.println("The value is: " + optional.get());
            } else {
                System.out.println("Optional is empty.");
            }
        }


}
