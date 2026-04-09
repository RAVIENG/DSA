import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer>list = new ArrayList<>();

        for(int i=1;i<6;i++){
            list.add(i);
        }
        list.add(2,10);
        System.out.println(list);

        for(int i=0;i<=5;i++){
            System.out.print(list.get(i)+"  ");
        }

        list.remove(3);
        System.out.println(list);

        list.set(3, 5);
        System.out.println(list);

        System.out.println(list.contains(3));
        System.out.println(list.contains(9));

        System.out.println(list.size());

        Collections.sort(list);
        System.out.println("Sorted List :"+ list);

        //reversed order Sorted list
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("reversed list :" + list);
        
    }
}
