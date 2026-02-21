package polymorphismpracticeQuestion3;
//What is the difference between static binding and dynamic binding?
class StaticBinding
{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
public class StaticAndDynamicBinding extends StaticBinding
{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args)
    {
        // Static Binding Example (Overloading)
        System.out.println(Math.abs(-5)); // Compiler decides which abs() to call
    //Math is static method to call output will be 5

        // Dynamic Binding Example (Overriding)
        StaticAndDynamicBinding obj = new StaticAndDynamicBinding();
        obj.sound();// Resolved at runtime -> "Dog barks"
    }
}
