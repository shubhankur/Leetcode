package Misc;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                else if (ch > '9' || ch < '1') return false;
                else {
                    if (charSet.contains(ch)) return false;
                    charSet.add(ch);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];
                if (ch == '.') continue;
                else if (ch > '9' || ch < '1') return false;
                else {
                    if (charSet.contains(ch)) return false;
                    charSet.add(ch);
                }
            }
        }
        int m = 0, n = 0;
        while (m < 9) {
            Set<Character> charSet = new HashSet<>();
            for (int i = m; i < m + 3; i++) {
                for (int j = n; j < n + 3; j++) {
                    char ch = board[i][j];
                    if (ch == '.') continue;
                    else if (ch > '9' || ch < '1') return false;
                    else {
                        if (charSet.contains(ch)) return false;
                        charSet.add(ch);
                    }
                }
            }
            if (n < 6) {
                n += 3;
            }
            else {
                m += 3;
                n = 0;
            }
        }
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
