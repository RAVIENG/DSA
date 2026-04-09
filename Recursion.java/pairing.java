public class pairing {
    public static int pairProblam(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1= pairProblam(n-1);

        int fnm2= pairProblam(n-2);

        int pairways = (n-1)*fnm2;

        return fnm1+pairways;
     

    }
    public static void main(String args[]){
     System.out.println(pairProblam(3));
    }
}
