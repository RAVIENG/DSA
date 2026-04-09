public class SortedArrayToBst {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node createBst(int arr[] , int start , int end){
        if(start>end){
            return null;
        }

        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
       root.left = createBst(arr, start, mid-1);
        root.right =createBst(arr, mid+1, end);

        return root;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        int start = 0;
        int end = arr.length-1;

        createBst(arr, start, end);
    }
}
