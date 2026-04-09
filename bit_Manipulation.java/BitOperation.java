public class BitOperation {

    public static int GetIthBit(int n, int i){
        int bitmask = 1<<i;
        if((bitmask&i)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int SetInBit(int n ,int i){
       int bitmask = 1<<i;
       return n | bitmask;
    }

    public static int ClearIthBit(int n , int i){
       int bitmask = ~(1<<i);
       return bitmask&n;
    }

    public static int UpdateIthBit(int n , int i , int newBit){
        if(newBit==0){
            return ClearIthBit(n, i);
        }

        else{
            return SetInBit(n, i);
        }
    }

    public static void main(String args[]){

    System.out.println(GetIthBit(5, 3));

   System.out.println(SetInBit(10, 2));

   System.out.println((ClearIthBit(10, 1)));

   System.out.println(UpdateIthBit(10, 2, 1));
    }
}
