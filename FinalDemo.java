class Animal {

    final void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks.");
    }
}

public class FinalDemo {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound(); // Calling final method
        d.bark();
    }
}