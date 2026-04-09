import java.util.*;
public class BinaryTreeB {
    static class Node{
        int data;
        Node left = null;
        Node right = null;

        Node(int data){
            this.data = data;
        }
    }

    static public class BinaryTree{
        static int idx=-1;;
        public  Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);

            return newNode;
        }

         public void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        //leval order 
        public static void levalOrder(Node root){
            if(root == null){
                return;
            }

            Queue <Node> q = new LinkedList<>();

            q.add(root);

            while (!q.isEmpty()) {
                Node curr = q.remove();
                System.out.println(curr.data);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

        }
    }
    public static void main(String[] args) {
        int nodes[] = {1 ,2 ,4 ,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree  = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);

        // leval order
        tree.levalOrder(root);
    }
}