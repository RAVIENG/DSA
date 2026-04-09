public class SubTreeOfAnotherTree {
    static class Node {
        int data;
        Node left = null;
        Node right = null;
        Node(int data){
            this.data = data;
        }  
    }

    public static boolean isSubtree(Node root , Node subtree){
        if (subtree == null) return true;
        if (root == null) return false;

        if(root.data==subtree.data){
            if(isIdentical(root,subtree)){
                return true;
            }
        }
        
        return isSubtree(root.left, subtree)||isSubtree(root.right, subtree);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;

        if (root.data != subRoot.data) return false;

        return isIdentical(root.left, subRoot.left) &&
           isIdentical(root.right, subRoot.right);
    }

    public static void main(String[] args) {
        Node root  = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);

       Node subtree = new Node(2);
       subtree.left= new Node(4);
       subtree.right= new Node(5); 

       System.out.println(isSubtree(root, subtree));
       
    }
}
