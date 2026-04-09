import java.util.*;
public class array_creation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[4][3];
         
        int row=matrix.length;
        int coloumn=matrix[0].length;
        //matrix[0] give 0 index row and we find the length of 0 index row and it return number of coloum
        System.out.print("enter the row and coloum");
        for(int i=0;i<row;i++){
            for(int j = 0;j<coloumn;j++){
             matrix[i][j] = sc.nextInt();
            }
        }

          for(int i=0;i<row;i++){
            for(int j = 0;j<coloumn;j++){
             System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
        
    }
}
