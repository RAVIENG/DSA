public class Diagonal_sum{
    public static int sum(int matrix[][]){
        //this is not good for better time complexity
    //    int sum = 0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             //primary digonals
    //             if(i==j){
    //                 sum+=matrix[i][j];
    //             }
    //             else if(i+j==matrix.length-1){
    //               sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //      return sum;
    int sum=0;
    for(int i=0;i<matrix.length;i++){
        //primary
        sum+=matrix[i][i];
        //secoundary
        if(i!=matrix.length-i-1)
        sum+=matrix[i][matrix.length-i-1];
          
    }
    return sum;



    }
    public static void main(String args[]){
        int matrix[][] = {
            {2,3,4,5},
            {6,7,8,9},
            {0,1,12,13},
            {14,15,16,17}
        };
     
       System.out.println(sum(matrix));
    }
}