package java8.optionalClass;

import java.util.Optional;

public class OptionalClassIntro {

    public static void main(String[] args) {

       /* String name = "null";
        Optional<String> optionalName = Optional.of(name);
        System.out.println("Optional Name: " + optionalName);         //null
        System.out.println("Optional Name: " + optionalName.get());   //null*/

      /*  String name = "abcd";
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println("Optional Name of nullable " + optionalName);         //null
        System.out.println("Optional Name: " + optionalName.get());   //null*/

       /* Optional<String> optionalName = Optional.of("John Doe");
        if (optionalName.isPresent()) {
            System.out.println("Name: " + optionalName.get());
        } else {
            System.out.println("No name found.");
        }*/

       /* Optional<String> s =  null;
        Optional<String> s1 = Optional.of("Java");

        Optional<String> optional = Optional.ofNullable(s).orElse(s1);
        optional.ifPresent(value -> System.out.println("value is "+value)); */  //
/*
        Optional<String> optionalEmail = Optional.empty();
        String email = optionalEmail.orElseGet(() -> "abc@def.com");
        System.out.println("Email: " + email);*/

        OptionalClassIntro obj = new OptionalClassIntro();
        obj.orElseVSorElseGet();

    }

    public void orElseVSorElseGet() {
        Optional<String> optional = Optional.ofNullable("ABCD");

        /* String orElseGetResult = optional.orElseThrow(new NullPointerException("NPE"));*/
        Optional<String> optionalName = Optional.ofNullable("null");
        String name = optionalName
                .orElseThrow(() -> new IllegalArgumentException("Name is absent"));

       /* String orElseGetResult = optional.orElseGet( this::getFunctionForTest);
        System.out.println("value in orElseGetResult " + orElseGetResult);

        String orElseResult = optional.orElse(this.getFunctionForTest());
        System.out.println("value in orElseResult " + orElseResult);*/
    }

    public String getFunctionForTest() {
        System.out.println("\n ===== function called ===== ");
        return "default value";
    }
}
