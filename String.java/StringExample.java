// import java.util.*;
public class StringExample {
    public static void printLetter(String firstname){
        for(int i=0 ;i<firstname.length();i++){
            System.out.print(firstname.charAt(i));
        }
        System.out.println();
    }
    public static void main(String args[]){
        // String str1 = "abcd";                  
        // String str2 = new String("xyz");  
        
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
         
        // System.out.println("enter name"+ name);
        // System.out.println(str1);
        // System.out.println(str2);
        
        //string length
        // String name = "tony stark";//it also count speace 
        // System.out.println(name.length());

        //concatenation
        String firstname = "ravi";
        String lastname  = " upreti";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        //to chak equal
        String s1= "tony";
        String s2 = new String("tony");

        if(s1.equals(s2)){
            System.out.println("s1 and s2 equal");

        }
        else{
            System.out.println("not equals");
        }
        
        printLetter(firstname);
    }
}
