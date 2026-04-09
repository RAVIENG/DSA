public class MirrorBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
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

        createMirror(root);
    }
}
