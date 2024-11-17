package edu.schollj3.assign04;

public class GameBoard {
    private char[][] board;
    private int rows;
    private int cols;
    private char fill;

    public GameBoard(int rowCnt, int colCnt, char fillChar) {
        board = new char[rowCnt][colCnt];
        rows = rowCnt;
        cols = colCnt;
        fill = fillChar;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = fill;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = fill;
            }
        }
    }

    public int getRowCnt() {return rows;}

    public int getColCnt() {return cols;}

    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public char getPos(int row, int col) {
        if (isValidPosition(row, col)) {
            return board[row][col];
        }else{
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c) {
        if (isValidPosition(row, col)) {
            board[row][col] = c;
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rows);
        sb.append(" x ");
        sb.append(cols);
        sb.append(" GameBoard (default: ");
        sb.append(fill);
        sb.append(")");
        return sb.toString();
    }

    public String getBoardString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

