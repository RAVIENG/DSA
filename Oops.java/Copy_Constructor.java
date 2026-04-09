class Student {
    int roll;
    String name;

    // Regular constructor
    Student(int r, String n) {
        roll = r;
        name = n;
    }

    // Copy constructor
    Student(Student s) {
        roll = s.roll;
        name = s.name;
    }

    void display() {
        System.out.println(roll + " " + name);
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ravi");  // original object
        Student s2 = new Student(s1);         // copy constructor used

        s1.display(); // 1 Ravi
        s2.display(); // 1 Ravi
    }
}
