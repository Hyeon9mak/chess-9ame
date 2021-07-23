package chessgame.domain.piece;

public class Knight extends ChessPiece {

    public Knight(Color color, Score score) {
        super(color, score);
    }

    public static Knight of(Color color) {
        return new Knight(color, Score.KNIGHT);
    }
}
