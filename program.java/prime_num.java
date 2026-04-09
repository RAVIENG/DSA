import java.util.*;
public class prime_num {
    public static boolean isprime(int n){
     if (n==2){
        return true;
     }
     boolean isprime =true;
     for(int i=2;i<=n-1;i++){
        
        if(n%i==0){
            isprime=false;
        }
     }
     return isprime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("enter a number:");
      int n = sc.nextInt();
       System.out.println(isprime(n));
         sc.close();
    
    }
}
