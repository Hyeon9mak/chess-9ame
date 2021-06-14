package chessgame.domain.piece;

public class Bishop extends ChessPiece {

    public Bishop(Color color, Score score) {
        super(color, score);
    }

    public static Bishop of(Color color) {
        return new Bishop(color, Score.BISHOP);
    }
}
