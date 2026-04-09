public class DoublyList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data= data;
            this.next= null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next= head;
        head.prev = newNode;
        head= newNode;
    }

    public void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public int removeFirst(){
        if(head==null){
            return -1;
        }
        int val = head.data;
        head = head.next;
        head.prev= null;
        return val;

    }
    public void reverseList(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
       DoublyList dll = new DoublyList();
       dll.addFirst(1);
       dll.addFirst(2);
       dll.addFirst(3);

       dll.printLL();
       System.out.println("remove first ");
       System.out.println(dll.removeFirst());
       dll.printLL();

       dll.reverseList();
    }
}
