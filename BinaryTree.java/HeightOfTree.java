public class HeightOfTree {
    static public class Node{
        int data;
        Node left = null;
        Node right = null;

        Node(int data){
            this.data = data;
        }
    }


    public static int HeightTree(Node root){
        if(root == null){
            return 0;
        }

       int lh= HeightTree(root.left);
       int rh= HeightTree(root.right);

       int height = Math.max(lh, rh)+1;
       
       return height;
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }

       int lh=count(root.left);
       int rh= count(root.right);
       int totalNode = lh+rh+1;

       return totalNode;
    }

    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }

        int ls = sumOfNode(root.left);
        int rs = sumOfNode(root.right);

        return ls+rs+root.data;
    }
    public static void main(String[] args) {

       Node root  = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       

        int height = HeightTree(root);
        System.out.println(height);

        System.out.println(count(root));

        System.out.println(sumOfNode(root));
    }
}
