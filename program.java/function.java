import java.util.*;
public class function{
    public static int product(int a ,int b ){
    int prod= a*b;
    return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number  :");
        int num1 = sc.nextInt();
        System.out.println("enter secound number :");
        int num2= sc.nextInt();
     int product = product(num1,num2); 
     System.out.println("the product of the number is :");
     System.out.println(product);
       sc.close();
    }
}
