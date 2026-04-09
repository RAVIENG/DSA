public class Transpose_matrix {
    public static void print_transpose(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " "); 
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][] = {
            {11, 12, 13}, 
            {21, 22, 23}
        };

        int row = matrix.length;       
        int col = matrix[0].length;     
        int transpose[][] = new int[col][row];

        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j]; 
            }
        }

        System.out.println("Transpose of matrix:");
        print_transpose(transpose);
    }
}

