import java.util.*;
public class MergeTwoBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void getImorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        getImorder(root.left, list);
        list.add(root.data);
        getImorder(root.right, list);
    }

    public static Node createBst(ArrayList<Integer> list,int st,int end){
            if(st>end){
                return null;
            }
            int mid = (st+end)/2;
            Node root = new Node(list.get(mid));
            root.left =  createBst(list, st, mid-1);
            root.right = createBst(list, mid+1, end);
            return root;
    }

   public static Node merge(Node root1 , Node root2){
        ArrayList<Integer> list1  = new ArrayList<>();
        getImorder(root1, list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        getImorder(root2, list2);

        ArrayList<Integer> finalList = new ArrayList<>();
        int i=0 , j = 0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }else{
                finalList.add(list2.get(j));
                j++;
            }
        }

        while (i<list1.size()) {
            finalList.add(list1.get(i));
            i++;
        }

        while (j<list2.size()) {
            finalList.add(list2.get(j));
            j++;
        }

       return  createBst(finalList , 0,finalList.size()-1);
   }
    public static void main(String[] args) {
        Node root = new Node(6);
        root.right = new Node(7);
        root.left  = new Node(4);

        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(8);
    }
}
