public class Fibonacci {
    public static int fib(int n){
        if(n==1||n==0){
            return n;
        }

        int fbn1= fib(n-1);
        int fbn2= fib(n-2);
        int fn = fbn1+fbn2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
