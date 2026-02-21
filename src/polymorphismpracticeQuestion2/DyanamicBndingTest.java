package polymorphismpracticeQuestion2;
/*
Ans: Method overriding in Java is called late binding or dynamic binding because
the method call is resolved at runtime based on the actual object
type, not the reference type.
This enables runtime polymorphism, allowing flexible and extensible code.
 */

 class Animal2 {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog2 extends Animal2 {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public class DyanamicBndingTest
    {
        public static void main(String[] args) {
            Animal2 a = new Dog2();  // Reference type: Animal, Object type: Dog
            a.sound();             // Output: Dog barks
        }
    }

