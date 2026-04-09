//Throws use when you can not handle the exception so throw it to caller function
//throw use when you forcefully push any code to catch block 
public class ThrowAndThrows {
    public static void main(String[] args) {
        // try{
        //     int a=2;
        //     if(a==2){
        //         throw new ArithmeticException();
        //     }
        // }catch(ArithmeticException e){
        //     System.out.println("error: "+e);
        // }

        try{
           checkage();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage()+ "Age not valid");
        }

    }
     public static void checkage() throws ArithmeticException {
            System.out.println(18/0);
        }
}
