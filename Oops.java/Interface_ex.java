// Interface = Rules for animals
interface Animal {
    void eat();   // every animal must eat
    void sleep(); // every animal must sleep
}

// Class Dog implements the interface
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones");
    }
    public void sleep() {
        System.out.println("Dog sleeps in kennel");
    }
}

// Class Cat implements the interface
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish");
    }
    public void sleep() {
        System.out.println("Cat sleeps on sofa");
    }
}

// Class Cow implements the interface
class Cow implements Animal {
    public void eat() {
        System.out.println("Cow eats grass");
    }
    public void sleep() {
        System.out.println("Cow sleeps in shed");
    }
}

public class Interface_ex {
    public static void main(String args[]) {
        Animal a1 = new Dog();
        a1.eat();
        a1.sleep();

        Animal a2 = new Cat();
        a2.eat();
        a2.sleep();

        Animal a3 = new Cow();
        a3.eat();
        a3.sleep();
    }
}
