import java.util.*;
public class MaxLengthChainPair {
    public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{27,40},{50,90}};
        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));

        int chainlength = 1;
        int endPair = pair[0][1];

        for(int i=1;i<pair.length;i++){
            if(pair[i][0]>endPair){
                chainlength++;
                endPair = pair[i][1];
            }
        }
        System.out.println("chainLength"+" "+chainlength);
    }
}
