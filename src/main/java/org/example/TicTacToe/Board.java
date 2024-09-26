package org.example.TicTacToe;

public class Board {
    int size;
    Pieces[][] board;

    Board(int size){
        this.size = size;
        board = new Pieces[size][size];
    }

    public void printBoard() {
        for(int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if(board[i][j] != null) System.out.print(board[i][j].type + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }

    public boolean getFreeSpaces() {
        for(int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if(board[i][j] == null) return true;
            }
        }
        return false;
    }

    public boolean addPiece(int x, int y, Pieces piece) {
        if(x > size-1 || x < 0 || y > size-1 || y < 0) return false;
        if(board[x][y] == null){
            board[x][y] = piece;
            return true;
        }
        return false;
    }

    public boolean verticalCheck(Pieces piece){
        for(int j=0; j<size; j++){
            boolean isSame = true;
            for (int i=0; i<size; i++){
                if(board[i][j] == null || board[i][j].type != piece.type){
                    isSame = false;
                    break;
                }

            }
            if (isSame) return true;
        }

        return false;
    }

    public boolean horizontalCheck(Pieces piece){
        for(int i=0; i<size; i++){
            boolean isSame = true;
            for (int j=0; j<size; j++){
                if(board[i][j] == null || board[i][j].type != piece.type){
                    isSame = false;
                    break;
                }
            }
            if (isSame) return true;
        }

        return false;
    }

    public boolean diagonalCheck(Pieces piece){
        for(int i=0; i<size; i++){
            if(board[i][i] == null || board[i][i].type != piece.type){
                return false;
            }
        }

        for(int i=size-1; i>=0; i--){
            if(board[i][(size - 1) - i] == null || board[i][(size - 1) - i].type != piece.type){
                return false;
            }
        }

        return true;
    }

    public boolean getWinner(Pieces piece) {
        return verticalCheck(piece) || horizontalCheck(piece) || diagonalCheck(piece);
    }
}
