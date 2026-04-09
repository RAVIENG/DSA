class Student {
    String name;
    int age;
    static String schoolName = "Greenwood School"; // static variable
    static int totalStudents = 0;                  // static variable

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        totalStudents++;   // Increase count when a new student is created
    }

    // Method to display student info
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", School: " + schoolName);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 12);
        Student s2 = new Student("Anita", 13);
        Student s3 = new Student("Rahul", 11);

        s1.display();
        s2.display();
        s3.display();

        // Access static variable directly from class
        System.out.println("Total Students in " + Student.schoolName + ": " + Student.totalStudents);
    }
}
