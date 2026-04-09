public class Occurance {
    public static int first_occurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return first_occurance(arr, key, i+1);
    }

    public static int last_occurance(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }

        int isfound = last_occurance(arr, key, i+1);

        if(arr[i]==key&&isfound==-1){
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,7,8,9,7,6};
        int i=0;
        int key = 7;

       System.out.println( first_occurance(arr, key, i));

       System.out.println(last_occurance(arr, key, i));
    }
}
