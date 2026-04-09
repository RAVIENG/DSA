public class LinkList{
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next = null;
        }
}
public static Node head;
public static Node tail;
public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);//create an new node 
        size++;
        if(head==null){//first insertation
            head=tail=newNode;
            return;
        }
        newNode.next = head;//secound insertation onwards
        head= newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail= newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void addMiddle(int data,int idx){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("empty list");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val; 
        }
        int val=head.data;
        size--;
        head = head.next;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("empty list");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val =head.data;
            head=tail=null;
            return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itrSerch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if (idx==-1) {
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
       return helper(head, key);
    }

    public void reverseList(){
        Node curr = tail = head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deleteNthNodeEnd(int n){
        int sz=0;
        Node temp=head;
        while (temp != null) {
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }

        int i=1;
        int iToFind = sz-n;
        Node prev= head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow =head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean palindrome(){
        if(head==null||head.next==null){
            return true;
        }
        Node minNode = findMid(head);
        Node prev=null;
        Node curr =minNode;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean cycleDetect(){
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){//work for when the last one is not point to head
        //cycle detect
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        //cycle remove
        slow =head;
        Node prev=null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    //get mid
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //merge
    public Node merge(Node head1 , Node head2){

        Node MergeLL = new Node(-1);
        Node temp = MergeLL;

        while (head1 != null && head2 != null) {
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            while (head1!=null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while (head2!=null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        return MergeLL;
    }
    // merge sort
    public Node mergeSort(Node head){
        if(head == null||head.next==null){
            return head;
        }

        Node mid = getMid(head);
        
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft , newRight);
    }

    public void zigZag(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node mid = slow;

        //reverse
        Node curr = mid.next;
        Node prev=null;
        Node next;
        while (curr != null) {
            next=curr.next;
            curr.next=prev;
            prev= curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL ,nextR;

        while (left!=null && right!=null) {
            nextL=left.next;
            left.next = right;
            nextR= right.next;
            right.next=nextL;

            left= nextL;
            right = nextR;
        }
    }
        public static void main(String[] args) {
        LinkList ll = new LinkList(); 
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);


        ll.addMiddle(5,2);
        ll.printList();
        System.out.println("Size of the List is : "+LinkList.size);

        System.out.println("______________________________________________");
        System.out.println("remove first : "+ll.removeFirst());
        ll.printList();

        System.out.println("_________________________________________________");
        System.out.println("remove last : "+ll.removeLast());
        ll.printList();

        System.out.println("_______________________Itrative Search__________________________");
        System.out.println(ll.itrSerch(2));
        System.out.println("_______________________Recursive search__________________________");
        System.out.println(ll.recursiveSearch(2));

        System.out.println("________________________Reverse List_______________________________");
        ll.reverseList();
        ll.printList();

        System.out.println("_________________________Delete Nth node___________________________");
        ll.deleteNthNodeEnd(1);
        ll.printList();
        System.out.println(ll.palindrome());
        
    }
}