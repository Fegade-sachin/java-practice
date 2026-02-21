package polymorphismpracticeQuestion2;
/*What actually polymorphism means in Java?
ans ==>
    Polymorphism in Java
Polymorphism in Java means the ability of an object to take on many forms.
It allows the same method or interface to behave differently depending on the object
that is invoking it.

*/
    class Animal {
        void sound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("The dog barks");
        }
    }

    class Cat extends Animal {
        void sound() {
            System.out.println("The cat meows");
        }
    }

    public class TestPolymorphism {
        public static void main(String[] args) {
            Animal a1 = new Dog();
            Animal a2 = new Cat();

            a1.sound(); // Output: The dog barks
            a2.sound(); // Output: The cat meows
        }
    }

