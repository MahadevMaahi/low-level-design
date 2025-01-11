package LLDSolutions.TicTacToeLLD.Player;

import LLDSolutions.TicTacToeLLD.Piece.Piece;

public class Player {
    public String name;
    public Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }
}
