public class Search_sorted {
    public static boolean stair_search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {2, 3, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12, 13},
            {14, 15, 16, 17}
        };
        int key = 11;
        stair_search(matrix, key); 
    }
}
