interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat implements Animal {

    public void eat() {
        System.out.println("Cat eats food");
    }
}

public class HybridInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.play();
        c.eat();
    }
}