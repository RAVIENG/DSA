import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchBlock {
    public static void main(String[] args) throws FileNotFoundException {
        method1();
        try{
           int c=5/0;
        }catch(ArithmeticException e){
            throw new ArithmeticException ("arthmatic ");
        }
    }

    static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("r.txt");
        System.out.println("File opened successfully");
    }
}
//for forcefully throw am exception we use throw keyword new throw