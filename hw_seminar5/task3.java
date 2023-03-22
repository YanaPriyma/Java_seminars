package hw_seminar5;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску.
// Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

import java.util.Arrays;

public class task3 {

    static int size = 8;
    static char[][] board = new char[size][size]; 

    public static void main(String[] args) {
        initStart(size);
    }

    public static void initStart(int n) {
        cleanBoard(board);
        for (int i = 0; i < n; i++) {
            board[0][i] = 'X';
            solveQueens(0, n);
            if (isValid(board)) {
                printBoard(board);
                System.out.println();
            }
            cleanBoard(board);
        }
    }

    public static void solveQueens(int col, int n) {
        if (col == n) return;
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col)) {
                board[row][col] = 'X';
                solveQueens(col + 1, n);
            }
        }
    }

    static boolean isValid(char[][] board) {
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            for (int row = 0; row < board[col].length; row++) {
                if (board[row][col] == 'X') {
                    count++;
                }
            }
        }
        return count == 8;
    }

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'X') return false;
        }

        for (int i = col + 1; i < board.length; i++) {
            if (board[row][i] == 'X') return false;
        }

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'X') return false;
        }

        for (int i = row - 1; i > 0; i--) {
            if (board[i][col] == 'X') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'X') return false;
        }

        for (int i = row + 1, j = col + 1; i < board.length && j < board.length; i++, j++) {
            if (board[i][j] == 'X') return false;
        }

        for (int i = row + 1, j = col - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'X') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'X') return false;
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

    public static void cleanBoard(char[][] board) {
        for (char[] chars : board) {
            Arrays.fill(chars, '0');
        }
    }
}
