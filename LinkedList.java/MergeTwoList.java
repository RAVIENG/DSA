public class MergeTwoList {
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
            if(List1.data <= List2.data){
                temp.next = List1;
                List1 = List1.next;
            }else{
                temp.next = List2;
                List2 = List2.next;
            }
            temp = temp.next;
        }

        if(List1 != null){
            temp.next = List1;
        }
        else{
            temp.next = List2;
        }

        return dummy.next;
    }


    public static void printList(Node head){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
        System.out.println("null");
}
    public static void main(String[] args) {
        Node List1 = new Node(1);
        List1.next = new Node(2);
        List1.next.next = new Node(4);

        Node List2 = new Node(1);
        List2.next = new Node(3);
        List2.next.next = new Node(4);

        Merge(List1, List2);
        printList(List2);
    }
}
