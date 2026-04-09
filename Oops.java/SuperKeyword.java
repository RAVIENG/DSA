class Parent {
    int x = 10;
    
    void showParent() {
        System.out.println("Parent x = " + x);
    }
}

class Child extends Parent {
    int x = 20;
    
    void showChild() {
        System.out.println("Child x = " + x);        // child current object
        System.out.println("Parent x = " + super.x); // parent current object
        super.showParent();                           // call parent method
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        // First child object
        Child c = new Child();
        c.showChild();

        System.out.println("-----");

        // Second child object
        Child d = new Child();  // second child current object
        d.showChild();
    }
}
