class Student {
    String name; // instance variable

    void setName(String name) { // local variable 'name'
        this.name = name; // assign local variable to instance variable
    }

    void show() {
        System.out.println("Name: " + name);
    }
}

public class this_key {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Alice");
        s.show(); // Name: Alice
    }
}
