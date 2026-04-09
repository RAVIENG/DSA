public class Sudoku2 {

    public static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check row
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num)
                return false;
        }

        // Check column
        for (int x = 0; x < 9; x++) {
            if (board[x][col] == num)
                return false;
        }

        // Check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num)
                    return false;
            }
        }

        return true;
    }

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            if (solveSudoku(board))
                                return true;

                            board[row][col] = 0;
                        }
                    }
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {0,0,0,8,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,9,1,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,0,0,0,5},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,0,0}
        };

        if (solveSudoku(sudoku)) {
            System.out.println("Solved Sudoku:");
            printBoard(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

