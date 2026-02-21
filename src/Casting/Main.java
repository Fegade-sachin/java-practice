package Casting;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting: Dog → Animal

        // Safe downcasting with instanceof
        if (a instanceof Dog) {
            Dog d = (Dog) a; // Downcasting: Animal → Dog
            d.bark();        // Access Dog-specific method
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.meow();
        } else {
            a.makeSound();
        }
    }
}