package opps.polymorphism.polymorphismpracticeQuestion4;

import java.io.IOException;

//34) Can we remove throws clause of a method while overriding it?
// Yes, you can remove the throws clause while overriding, but you cannot add broader checked exceptions.
class Parent {
    void display() throws IOException {
        System.out.println("Parent display");
    }
}

class Child extends Parent
{
    @Override
    void display()
    {
        // No throws clause here
        System.out.println("Child display");
    }

    public static void main(String[] args)
    {
     Child child = new Child();
     child.display();

    }
}