import java.util.*;

 class Job {   
        int deadline;
        int profit;
        int id;

        Job(int deadline, int profit, int id) {
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }
public class JobSequenceing {
    public static void main(String[] args) {

        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(jobInfo[i][0], jobInfo[i][1], i));
        }

        Collections.sort(jobs , (obj1,obj2)->obj2.profit-obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0;i<jobInfo.length;i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i));
        }
        System.out.println();
    }
}
