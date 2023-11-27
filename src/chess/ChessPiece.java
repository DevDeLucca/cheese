package chess;

import boardGamer.Board;
import boardGamer.Piece;

public class ChessPiece extends Piece {

    private Color color;
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
