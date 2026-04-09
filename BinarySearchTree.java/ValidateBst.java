public class ValidateBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static boolean validateBst(Node root , int min , int max){
        if(root == null){
            return true;
        }

        if(root.data>=min&&root.data<=max){
            boolean left = validateBst(root.left, min,root.data);
            boolean right = validateBst(root.right, root.data, max);
            return left&&right;
        }
        else{
            return false;
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

        System.out.println(validateBst(root,Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
