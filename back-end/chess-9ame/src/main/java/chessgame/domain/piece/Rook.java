package chessgame.domain.piece;

public class Rook extends ChessPiece {

    public Rook(Color color, Score score) {
        super(color, score);
    }

    public static Rook of(Color color) {
        return new Rook(color, Score.ROOK);
    }
}
