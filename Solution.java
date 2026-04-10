public class Solution {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node Merge(Node List1, Node List2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (List1 != null && List2 != null ) {
            if(List1.data > List2.data){
                temp = List2.next;
            }
        }
    }
    public static void main(String args[]){
        Node List1 = new Node(1);
        List1.next = new Node(2);
        List1.next.next = new Node(4);

        Node List2 = new Node(1);
        List2.next = new Node(3);
        List2.next.next = new Node(4);

    }
}
