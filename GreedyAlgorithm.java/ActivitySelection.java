import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //if Array not sort
        int activity[][] = new int[start.length][end.length];
        for(int i=0;i<activity.length;i++){
            activity[i][0] = i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }

        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));

        ArrayList<Integer> list = new ArrayList<>();
        int max=1;
        list.add(0);
        int lastEnd = end[0];
        for(int i=0;i<end.length;i++){
            if(start[i]>=lastEnd){
                max++;
                list.add(i);
                lastEnd=end[i];
            }
        }

        System.out.println(max);
        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+" ");
        }
    }
}
