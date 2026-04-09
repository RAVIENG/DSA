public class EvenOdd {

    public static void EVENoODD(int n){
       int bitmask = 1;

      if((n&bitmask)==0){
        System.out.println("number is even");        
         }
       else{
   
        System.out.println("number is odd number");
      
      }
    }
    public static void main(String args[]){
       EVENoODD(75);
    }
}
