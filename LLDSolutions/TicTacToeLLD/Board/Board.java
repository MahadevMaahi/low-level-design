package LLDSolutions.TicTacToeLLD.Board;

import java.util.ArrayList;
import java.util.List;

import LLDSolutions.TicTacToeLLD.Piece.Piece;

public class Board {
    public int size;
    public Piece[][] boardState;


    public Board(int size) {
        this.size = size;
        this.boardState = new Piece[size][size];
    }

    public Boolean placePiece(int row, int col, Piece piece) {
        if (row < 0 || col < 0 || row >= size || col >= size) {
            System.out.println("Illegal row and Column entry Try Again..");
            return false;
        }
        if (boardState[row][col] != null) {
            System.out.println("Entry is already occupied Try Again..");
            return false;
        }

        boardState[row][col] = piece;
        return true;
    }

    public List<List<Integer>> getFreeCells() {
        List<List<Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (boardState[i][j] == null) {
                    List<Integer> freeCell = new ArrayList<>();
                    freeCell.add(i);
                    freeCell.add(j);
                    freeCells.add(freeCell);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (boardState[i][j] != null) {
                    System.out.print("| " + boardState[i][j].pieceType.name() + " ");
                } else {
                    System.out.print("!   ");
                }
            }
            System.out.println("|");
        }
    }

    public boolean canMakeMove() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (boardState[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAWinMove(int row, int col, Piece piece) {
        return isRowMatch(row, col, piece) ||
        isColMatch(row, col, piece) ||
        isDiagonalMatch(row, col, piece);
    }

    private boolean isRowMatch(int row, int col, Piece piece) {
        for (int i = 0; i < size; i++) {
            if(boardState[row][i] == null || boardState[row][i].pieceType != piece.pieceType) {
                return false;
            }
        }
        return true;
    }

    private boolean isColMatch(int row, int col, Piece piece) {
        for (int i = 0; i < size; i++) {
            if(boardState[i][col] == null || boardState[i][col].pieceType != piece.pieceType) {
                return false;
            }
        }
        return true;
    }

    private boolean isDiagonalMatch(int row, int col, Piece piece) {
        if(isOnDiagonal(row, col)) {
            for(int i = 0; i < size; i++) {
                if(boardState[i][i] == null || boardState[i][i].pieceType != piece.pieceType) {
                    return false;
                }
                if(boardState[size - 1 - i][size - 1 - i] == null || boardState[size - 1 - i][size - 1 - i].pieceType != piece.pieceType) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean isOnDiagonal(int row, int col) {
        return (((row - col) == 0) || ((row + col) == (size - 1)));
    }
}
