public class Tiling_Problam {
    public static int tilling(int n){
        if(n==1||n==0){
            return 1;
        }

        //vertical choice
        int fnm1 = tilling(n-1);

        //horizontal choice
        int fnm2 = tilling(n-2);

        return fnm1+fnm2;
    }
    public static void main(String args[]){
     
      System.out.println(tilling(2));
    }
}
