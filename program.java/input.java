import java.util.Scanner;
public class input {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter your name");
    String n= sc.nextLine();
    System.out.println("Hello " + n + ", welcome to the Java program!");
    sc.close();
    
    }
}
