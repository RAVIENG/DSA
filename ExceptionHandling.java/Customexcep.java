//1. Checked Exception
//These are exceptions that are checked at compile time.
//The programmer must handle them using try–catch or throws keyword.

//2. Unchecked Exception
//These are exceptions that occur at runtime (not checked by compiler).
//Programmer is not forced to handle them.

//in java two class has not public so in one remove it

class  AgeLessThenZeroException extends RuntimeException {
        AgeLessThenZeroException(String messege){
            super("age can not negative");
        }
}
public class Customexcep {
    public static void main(String[] args) {    
           AgeCheck(37);          
    }
    public static void AgeCheck(int age){
        if(age<0){
            throw new AgeLessThenZeroException("something want wrong");
        }else{
            System.out.println("age is Correct");
        }
    }
}