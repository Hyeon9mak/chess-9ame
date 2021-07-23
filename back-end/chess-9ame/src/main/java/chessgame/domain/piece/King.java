package chessgame.domain.piece;

public class King extends ChessPiece {

    public King(Color color, Score score) {
        super(color, score);
    }

    public static King of(Color color) {
        return new King(color, Score.KING);
    }
}
