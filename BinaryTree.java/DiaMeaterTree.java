class DiaMeaterTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int diameter = 0;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        diameter = Math.max(diameter, lh + rh + 1);

        return Math.max(lh, rh) + 1;
    }

    public static int diameterOfBinaryTree(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }
    public static void main(String[] args) {
       Node root  = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       
       System.out.println(diameterOfBinaryTree(root));
    }
}
