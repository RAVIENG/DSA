import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[]= {10,20,30};
        int W=50;

        double ratio[][] = new double[value.length][2];

        for(int i=0;i<ratio.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio,(a,b)->Double.compare(b[1],a[1]));
        int capacity = W;
        int finalValue=0;
        for(int i=0;i<ratio.length;i++){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalValue+=value[idx];
                capacity-=weight[idx];
            }else{
                finalValue+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(finalValue);
    }
}
