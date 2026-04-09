public class BinarySearch {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }    

    }

    public static Node insert(Node root , int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data>value){
            root.left = insert(root.left, value);
        }else{
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean search(Node root , int key){
        if (root==null) {
            return false;
        }

        if(root.data==key){
            return true;
        }

        if(root.data>key){
           return search(root.left, key);
        }

        else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root , int key){
        if(root == null){
            return null;
        }

        if(root.data>key){
           root.left= delete(root.left, key);          
        } 

        else if(root.data<key){
           root.right = delete(root.right, key);
        }

        else{

            if(root.left == null && root.right== null){
                return null;
            }

            if(root.left==null){
            return root.right;
            }
            else if(root.right==null){
            return root.left;
            }
            
            Node Is = inOrderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);

        }
        return root;
    }
    public static Node inOrderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root= null;
        for(int i=0;i<value.length;i++){
           root =  insert(root, value[i]);
        }

        System.out.println();
        System.out.println(search(root, 22));

        delete(root, 14);
        inOrder(root);
    }
}
