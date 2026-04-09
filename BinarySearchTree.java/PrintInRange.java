public class PrintInRange {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void printRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }

        if(root.data>=k1&&root.data<=k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
        }else if(root.data>k2){
            printRange(root.left, k1, k2);
        }else{
            printRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left=new Node(3);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.right = new  Node(10);
        root.right.right = new Node(11);
        root.right.right.right= new Node(14);

        printRange(root, 5, 12 );
    }
}
