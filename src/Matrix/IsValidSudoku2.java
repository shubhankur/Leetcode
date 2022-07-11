package Matrix;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku2 {
    public static boolean isValidSudoku(char[][] board) {
        for (int i =0;i< board.length;i++){
            for (int j = 0;j< board[i].length;j++){
                if(!isValid(board,i,j))
                    return false;
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int i, int j){
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                                    {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                                    {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                                    {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                                    {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                                    {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                                    {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                                    {'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
        System.out.println(isValidSudoku(board));
    }
}
