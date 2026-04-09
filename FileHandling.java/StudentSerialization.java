import java.io.Serializable;
import java.io.*;
import java.util.*;

 class Student implements Serializable {
    private String name;
    private int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return name + " - Age: " + age + ", Marks: " + marks;
    }
}

public class StudentSerialization {
    public static void main(String[] args) {

        // List of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ravi", 20, 88.5));
        students.add(new Student("Meena", 21, 92.3));
        students.add(new Student("Amit", 19, 76.0));

        // ---- Serialize list to file ----
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(students);
            System.out.println("Students serialized successfully!");
        } catch (Exception e) {
            System.out.println("Error during serialization: " + e);
        }

        // ---- Deserialize list from file ----
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            List<Student> restoredList = (List<Student>) ois.readObject();

            System.out.println("\nDeserialized Student List:");
            for (Student s : restoredList) {
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Error during deserialization: " + e);
        }
    }
}
